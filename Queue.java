
public interface Queue {
	
	// precondition: item is not null
	// postcondition: Adds item to the end of the queue.
	public void enqueue(Object item);

	// precondition: none
	// postcondition: Removes and returns the item at the front of the queue. Returns null if the queue is empty.
	public Object dequeue();
	
	// preconditon: none
	// postcondition: Returns true if the queue is empty, false otherwise.
	public boolean isEmpty();
	
	// precondition: none
	// postcondition: Returns the number of items in the queue.
	public int size();


}
