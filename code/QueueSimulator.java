import java.lang.*;

public class QueueSimulator {
	public enum Event {
		ARRIVAL, DEPARTURE
	};

	// Following field variables
	private double currTime; // keeps track of the current progression of a simulation
	private double arrivalRate; // stores lambda
	private double serviceTime; // stores 1/u
	private double timeForNextArrival; // stores the time at which the next packet will arrive into the buffer queue
	private double timeForNextDeparture; // keep track of the time at which a packet will depart from the buffer queue
	private double totalSimTime; // denotes the total time duration for which the simulation is run for
	LinkedListQueue<Data> buffer = new LinkedListQueue<Data>();
	LinkedListQueue<Data> eventQueue = new LinkedListQueue<Data>();
	private Event e; // used to store information about the next event that will occur in the simulation

	public double getRandTime(double arrivalRate) { // arrival time for the first packet into the queue is computed via thegetRandTime
		double num, time1, max = 1, min = 0, randNUM;
		randNUM = Math.random();
		time1 = (-1 / arrivalRate) * (Math.log(1 - randNUM));
		return time1;
	}

	public QueueSimulator(double aR, double servT, double simT) {
		// Initialization
		arrivalRate = aR;
		serviceTime = servT;
		totalSimTime = simT;
		timeForNextArrival = getRandTime(aR);
		timeForNextDeparture = timeForNextArrival + servT;
	}

	public double calcAverageWaitingTime() {
		double timePacket = 0;
		double numPackets = eventQueue.size();
		while (!(eventQueue.isEmpty())) {
			timePacket += eventQueue.first().getDepartureTime() - eventQueue.first().getArrivalTime();
			eventQueue.dequeue();
		}
		return timePacket / numPackets;
	}

	public void event(Event e) {
		switch (e) {
		case ARRIVAL:
			Data packet = new Data();
			currTime = timeForNextArrival;
			packet.setArrivalTime(timeForNextArrival);
			buffer.enqueue(packet);
			timeForNextArrival += getRandTime(arrivalRate);
			break;

		case DEPARTURE:
			currTime = timeForNextDeparture;
			buffer.first().setDepartureTime(timeForNextDeparture);
			eventQueue.enqueue(buffer.dequeue());
			if (buffer.isEmpty())
				timeForNextDeparture = timeForNextArrival + serviceTime;
			else
				timeForNextDeparture += serviceTime;
			break;

		default:
			break;
		}
	}

	public double runSimulation() {
		while (currTime < totalSimTime) {
			if ((timeForNextArrival < timeForNextDeparture) || buffer.isEmpty()) {
				event(Event.ARRIVAL);
			} else {
				event(Event.DEPARTURE);
			}
		}
		return calcAverageWaitingTime();
	}
}
