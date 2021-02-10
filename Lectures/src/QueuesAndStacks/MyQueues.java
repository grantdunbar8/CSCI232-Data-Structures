package QueuesAndStacks;

public class MyQueues {

		/*
		 * This is for adding and removing items from first in first out Queues
		 * 

		public boolean isEmpty() {
			return head == null;
		}
		public void enqueue(MyListNode data) {
			if(isEmpty()){  //checks is the queue is empty
				head = new MyListNode<MyListNode>(data, null); //create a new head node for the queue
				tail = head; //set tail to be the same node because it is the only one
			}else { //queue is not empty
				tail.next = new MyListNode<MyListNode>(data, null); //create new node after the tail node
				tail = tail.next; //makes new final node the tail;
			}
		}
		public MyListNode<MyListNode> dequeue() {
			MyListNode<MyListNode> first = head; //look what the first node is, first is a holder for head
			head = head.next;//removes first element from the queue
			if(tail == first) {//checks if there was only one item
				tail = head;//sets the tail equal to the new head
			}
			return first;//returns removed item
		}
		*/
		
		

}
