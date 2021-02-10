package QueuesAndStacks;

public class MyStack {
	/*This is for adding and removing items from a Stack
	 * 
	 * public void push(MyListNode data) {
		if(isEmpty()){  //checks is the queue is empty
			head = new MyListNode<MyListNode>(data, null); //create a new head node for the queue
			tail = head; //set tail to be the same node because it is the only one
		}else { //queue is not empty
			MyListNode<MyListNode> oldHead = head; //Take current head of our stack and save that in the variable oldHead
			head = new MyListNode<MyListNode>(data,null); //Create new Node from head
			head.next = oldHead; //This lets for a very clean implementation of push and pop
		}
	}
	public MyListNode<MyListNode> pop() {
		MyListNode<MyListNode> first;
		first = head;
		head = head.next;
		if(tail == first){
			tail = head;
		}
		return first;
		
	}



	 * 
	*/

}
