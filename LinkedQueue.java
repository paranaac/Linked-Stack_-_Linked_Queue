
/**
 * @author Alejandro
 * @date 11/03/2014
 * @purpose: Linked Queue
 */
public class LinkedQueue<T> {
	private Node<T> front;
	private Node<T> back;
	private int size;

	public LinkedQueue() {
		front = null;
		back = null;
		size = 0;
	}

	public void enqueue(T data) {
		size++;
		Node<T> enqNode = new Node<T>(data);
		if (back == null) {
			front = enqNode;
		} else {
			back.setNext(enqNode);
		}
		back = enqNode;
	}

	public T dequeue() {
		T item = null;
		if (!isEmpty()) {
			item = front.getData();
			front = front.getNext();
			if (front == null) {
				back = null;
			}
			size--;
		}
		return item;
	}

	public boolean isEmpty() {
		return size == 0;
	}
	
	public int size() {
		return size;
	}
	
	/************************************
	 * Return the string representation of the list
	 *************************************/
	@Override
	public String toString() {
		StringBuilder strB = new StringBuilder();
		Node<T> current = front;
		while (current != null) {
			strB.append(current.getData()).append("\n");
			current = current.getNext();
		}
		return strB.toString();
	}
}
