
public interface Stack {

	// precondition: item is not null
	// postcondition: adds the item to the top of the stack
	public void push(Object item);

	// precondition: none
	// postcondition: Removes and returns the top item from the stack. Returns null if the stack is empty.
	public Object pop();

	// precondition: none
	// postcondition: Returns a reference to the top item on the stack, but does not remove it. 
	// 				  Returns null if the stack is empty.
	public Object peek();

	// precondition: none
	// postcondition: Returns true if the stack is empty, false otherwise.
	public boolean isEmpty();


}
