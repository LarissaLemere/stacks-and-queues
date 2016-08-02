// Larissa Lemere & Lucas Glendinning 
// 14/04/16
// implements the stack data structure using an array to hold the stack

public class MyStack implements Stack{
	// Member Vars
	Object [] Stack = new Object [10]; // declare array to hold the stack
	int index = 0; // declares an index for in the array
	
	// precondition: item is not null
	// postcondition: adds the item to the top of the stack
	public void push(Object item){
		Stack[index]=item; // add the item to the array
		index++; // increase the index count
		
		if(index==Stack.length){ // checks to see if the array is near max capacity 
			increaseSize(); // if the array is full, increase the size
		}
	}

	// precondition: none
	// postcondition: Removes and returns the top item from the stack. Returns null if the stack is empty.
	public Object pop(){
		if(isEmpty()){ // checks to see if the array is empty
			return null; // returns null if the array is empty
		}
		// if it's not empty...
		index--; // decrease the index size to index the top object on the stack
		Object temp = Stack[index]; // set a temp variable equal to the object that is being removed
		Stack[index]=null; // removes the object
		return temp; // return the variable that was removed

	}

	// precondition: none
	// postcondition: Returns a reference to the top item on the stack, but does not remove it. 
	// 				  Returns null if the stack is empty.
	public Object peek(){
		if(isEmpty()){ // checks to see if the array is empty
			return null; // if the array is empty, return null
		}
		return Stack[index-1]; // if it's not empty, return the last item added to the list
	}

	// precondition: none
	// postcondition: Returns true if the stack is empty, false otherwise.
	public boolean isEmpty(){
		if(Stack[0]==null){ // checks to see if the stack is empty
			return true; // returns true if it is
		}
		return false; // returns false if it is not empty
	}
	private void increaseSize()	{
		// Create an array of double the size.
		Object[] biggerItems = new Object[Stack.length*2]; // create new array equal to twice the size of the previous array

		// Copy all items to the new array.
		for (int i = 0; i<Stack.length; i++){ // loop through the old array
			biggerItems[i] = Stack[i]; // transfer the old variables into the new array
		}
		// Overwrites the old array with the new array.
		Stack = biggerItems;

	}

}
