/**
 * @author Alejandro
 * @date 11/03/2014
 * @purpose: Driver For Linked Stack & Queue
 */
public class Driver {
	public static void main(String[] args) {

		// LINKED STACK
		LinkedStack<Integer> stack = new LinkedStack<Integer>();

		// Populate the linked stack
		for (int i = 0; i < 25; i++) {
			if (i % 2 == 0) {
				stack.push(i);
			}
		}
		// Print and pop values in the stack
		StringBuilder strB = new StringBuilder();
		strB.append("Evens: ");
		while (!stack.isEmpty()) {
			strB.append(stack.pop()).append(", ");
		}
		System.out.println(strB.toString().replaceAll(", $", ""));
		System.out.println();

		// LINKED QUEUE
		LinkedQueue<String> supportTicketsList = new LinkedQueue<String>();

		// Populate the linked queue
		supportTicketsList.enqueue("Ticket 355 [John Smith]");
		supportTicketsList.enqueue("Ticket 356 [Mike Buffalo]");
		supportTicketsList.enqueue("Ticket 357 [David Wagner]");
		System.out.println("Open Support Tickets");
		System.out.println(supportTicketsList);

		supportTicketsList.dequeue();
		supportTicketsList.dequeue();
		System.out.println("Open Support Tickets");
		System.out.println(supportTicketsList);
	}
}
