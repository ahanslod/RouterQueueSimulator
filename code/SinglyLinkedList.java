//represents a linkedlist of elements of a generic type
public class SinglyLinkedList<E> {
	private static class Node<E> {
		private E e;
		private Node<E> n;

		// This class is composed of a local private Node class that consists of a
		// generic element E and a reference to the next Node.
		public Node(E e, Node<E> n) {
			this.e = e;
			this.n = n;
		}

		public E getElement() {
			return this.e;
		}

		public Node<E> getNext() {
			return this.n;
		}

		public void setNext(Node<E> n) {
			this.n = n;
		}
	}

	public Node<E> head;
	public Node<E> tail;
	int size;

	public SinglyLinkedList() {
		head = null;
		tail = null;
		size = 0;

		// utilized to implement the Queue interface in LinkedListQueue.java
	}

	public int size() {
		return size;
		// returns number of nodes in the linked list
	}

	public boolean isEmpty() {
		return size == 0;
		// returns true if linked list has no nodes and false otherwise
	}

	public E first() {
		if (isEmpty()) {
			return null;
		}
		return head.getElement();
		// returns the content stored at the front of the linked list
	}

	public E last() {
		if (isEmpty()) {
			return null;
		}
		return tail.getElement();
		// returns the the content stored at the end of the linked list
	}

	public void addFirst(E element) {
		head = new Node<E>(element, head);
		if (size() == 0) {
			tail = head;
			// size++;
		}
		size++;
		// adds a node containing element to the front of the linked list
	}

	public void addLast(E element) {
		Node<E> newNode = new Node<>(element, null);
		if (isEmpty())
			addFirst(element);
		else {
			tail.setNext(newNode);
			tail = newNode;
			size++;
		}
		// adds a node containing element to the end of the linked list
	}

	public E removeFirst() {
		// removes the node at the front of the linked list
		if (isEmpty()) {
			return null;
		}
		E reference = head.getElement();
		head = head.getNext();
		size--;
		if (size == 0) {
			tail = null;
		}
		return reference;
	}

}
