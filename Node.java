//Larissa Lemere
//03/28/16
// Node class for a linked list
public class Node {

	// Member variables.
	private Object data; // May be any type you'd like.
	private Node next;

	public Node()
	{
		this.data = null;
		this.next = null;
	}
	
	public Node(Object obj) {
		this.data = obj; // Record my data!
		this.next = null; // Set next neighbour to be null.
	}
	// Sets the next neighbouring node equal to nextNode
	public void setNext(Node nextNode){
		this.next=nextNode; // variable next = the next incoming variable
	}
	// Sets the item equal to the parameter specified.
	public void setItem(Object newItem){
		this.data = newItem; // sets data to hold the new item 
	}
	// Returns a reference to the next node.
	public Node getNext(){
		return this.next; // returns the Node that's next
	}
	// Returns this node ’s item.
	public Object getItem() {
		return this.data;	// returns the current node
	}
}
