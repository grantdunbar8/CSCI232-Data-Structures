package ProblemSet1;

public class Node {
	 public Node data;
	 public char c;
	 public Node next;
	 


	 public Node(char Char, Node next) {
		 c = Char;
		 this.next = next;
	}
	
	 public Node getNext(){return next;}
	 public void setNext(Node temp) {next = temp;}
	 public double getChar(){return c;}
	 public double setChar(char newChar){c = newChar; return c;}
}
