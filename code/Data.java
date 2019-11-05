public class Data{
  double arrivalTime;
  double departureTime;
  public Data(){
	  arrivalTime = 0;
	  departureTime = 0;
	  //initializes the private field variables to 0
  }
  public void setArrivalTime(double a){
	  arrivalTime = a;
	  //sets arrivalTime variable to the argument passed into the function
  }
  public void setDepartureTime(double d){
	  departureTime = d;
	  //sets departureTime variable to the argument passed into the function
  }
  public double getDepartureTime(){
	  return departureTime;
	  //returns the value stored in the departureTime variable
  }
  public double getArrivalTime(){
	  return arrivalTime;
	  //returns the value stored in the arrivalTime variable
  }
}
//javac Queue.java SinglyLinkedList.java LinkedListQueue.java Data.java QueueSimulator.java Test.java