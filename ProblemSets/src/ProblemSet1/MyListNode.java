package ProblemSet1;

public class MyListNode {
	 public MyListNode data;
	 public double x;
	 public double y;
	 public MyListNode next;
	 


	 public MyListNode(double xV, double yV, MyListNode next) {
		 x = xV;
		 y = yV;
		 this.next = next;
	}
	
	 public MyListNode getNext(){return next;}
	 public void setNext(MyListNode temp) {next = temp;}
	 public double getX(){return x;}
	 public double getY(){return y;}
	 public double setX(double newX){x = newX; return x;}
	 public double setY(double newY){y = newY; return y;}
}
