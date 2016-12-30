
/**
 * @author Alejandro
 * @date 11/03/2014
 * @purpose: Linked Stack
 */
public class LinkedStack<T> {
	private Node<T> top;

	public LinkedStack() {
		top = null;
	}

	/************************************
	 * Push a new element onto the stack
	 *************************************/
	public void push(T data) {
		Node<T> temp = new Node<T>(data);
		temp.setNext(top);
		top = temp;
	}

	/************************************
	 * Remove and return the element at the top
	 *************************************/
	public T pop() {
		T item = null;
		if (!isEmpty()) {
			item = top.getData();
			top = top.getNext();
		}
		return item;
	}

	/************************************
	 * Return true if the list is empty
	 *************************************/
	public boolean isEmpty() {
		return top == null;
	}
	
	/************************************
	 * Return the string representation of the list
	 *************************************/
	@Override
	public String toString() {
		StringBuilder strB = new StringBuilder();
		Node<T> current = top;
		while (current != null) {
			strB.append(current.getData()).append(" ");
			current = current.getNext();
		}
		return strB.toString();
	}
}
