# RouterQueueSimulator
## Introduction to Data Networks ##

### Simulation ###

1. Use the command line to get to your projectDirectory\code.

2. Compile the program
> javac Queue.java SinglyLinkedList.java LinkedListQueue.java Data.java QueueSimulator.java Test.java

3. Run the RouterQueueSimulation
> java Test 2 

4. Outputs from the simulation should match the following Sojourn Times 
```
Simulated for 100000s with Arrival Rate of 1 packets/sec and Service Rate of 10 packets/sec:
Sojourn time is 0.1053200733887289 seconds

Simulated for 100000s with Arrival Rate of 5 packets/sec and Service Rate of 10 packets/sec:
Sojourn time is 0.14971128062822556 seconds

Simulated for 100000s with Arrival Rate of 7 packets/sec and Service Rate of 10 packets/sec:
Sojourn time is 0.21592158821007307 seconds

Simulated for 100000s with Arrival Rate of 9 packets/sec and Service Rate of 10 packets/sec:
Sojourn time is 0.5586680404088109 seconds

Simulated for 100000s with Arrival Rate of 10 packets/sec and Service Rate of 10 packets/sec:

Sojourn time is 31.786198308478394 seconds
```

##### Note: The outputs from Part 2 should match the exected output above to one decimal place for the first four outputs of the runSimulation Function. The fifth output, due to the randomness of the simulation can vary every time you run the program. However, it is expected to be much larger than the first four outputs.
