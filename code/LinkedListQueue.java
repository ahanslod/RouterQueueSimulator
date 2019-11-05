public class LinkedListQueue<E> implements Queue<E>{
	//https://algs4.cs.princeton.edu/13stacks/LinkedQueue.java.html	
	
//    public LinkedListQueue<E> first;    // beginning of queue
//    public LinkedListQueue<E> last; 
	SinglyLinkedList<E> llq = new SinglyLinkedList<E>();
    
    
  public LinkedListQueue(){
	  //initializes the private field variables
  }
  public int size(){
	  return llq.size();
	  //returns # of nodes in the queue
  }
  public boolean isEmpty(){
	  return llq.isEmpty();
	  //checks whether queue has any nodes
  }
  public E first(){
	  return llq.first();
	  //returns element at the front of the queue
  }
  public void enqueue(E node){
	  //addLast();
	  llq.addLast(node);
	  //inserts a node to the back of the queue
  }
  public E dequeue(){
	  //removeFirst();
	  return llq.removeFirst();
	  //removes a node from the front of the queue
	  
  }
}
