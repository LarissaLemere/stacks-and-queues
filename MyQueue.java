// Larissa Lemere
// 15/04/16
// implements the queue data structure using a linked list to hold the queue
public class MyQueue implements Queue {
	private Object data; //current data place holder
	private int size = 0; // number of nodes
	private Node head = null; // head of the linked list - first node
	// precondition: item is not null
	// postcondition: Adds item to the end of the queue.
	public static void main (String [] args){
		
		MyQueue set = new MyQueue();
		
		/*System.out.println(set.isEmpty());
		System.out.println(set.size());*/
		set.enqueue("5");
		set.enqueue("4");
		//System.out.println(set.size());
		set.enqueue("3");
		set.enqueue("2");
		set.enqueue("1");
		/*System.out.println(set.isEmpty());
		System.out.println(set.size());*/
		System.out.println(set.dequeue());
		System.out.println(set.dequeue());
		//set.dequeue();
		//set.dequeue();
	
		
	}
	public void enqueue(Object item){
		Node temp = head; // Set head to a new temporary variable 
		if (head != null) { // if the head does not equal null...
			Node oldhead = head;
			head = new Node (item);
			head.setNext(oldhead);

		} 
		else{ // if the head is null
			head = new Node(item); // add the new var. to be the head of the linked list if one is not present already
		}
		size++; // increase the size of the node count

	}

	// precondition: none
	// postcondition: Removes and returns the item at the front of the queue. Returns null if the queue is empty.
	public Object dequeue(){
		Node temp = head;
		Node temp2 = null;
		if(isEmpty()){
			return null;
		}
		while(temp.getNext().getNext()!=null){ // Loops through the link list of nodes
			temp=temp.getNext(); // set the current node equal to the next in line to iterate through the list			
			
		}
		temp2 = temp.getNext();
		temp.setNext(null); // set equal to null if it's there
		size--; // decrease the size count for the removed object
		return temp2.getItem();

	}

	// preconditon: none
	// postcondition: Returns true if the queue is empty, false otherwise.
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		return false;

	}

	// precondition: none
	// postcondition: Returns the number of items in the queue.
	public int size(){	
		return size; // Because the size is being traced by the add and remove methods, the only thing needed to be done here is remove that value
	}



}
