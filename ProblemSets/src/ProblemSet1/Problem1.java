package ProblemSet1;
import java.util.Random;
import java.util.Scanner;
public class Problem1 {
	private static MyListNode head;
	private static MyListNode tail;
	public static void main (String args[] ) {
		MyListNode2d();
	}
	public static double MyListNode2d() {
		Random random = new Random();
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the amount of points you would like to create:");
		int n = keyboard.nextInt();
		
		for(int i = 0; i <= n; i++) {
			push(random.nextDouble(), random.nextDouble());
		}
		MyListNode printer = head;
		while(printer.getNext() != null) {
			printer = printer.getNext();
		}
		MyListNode[] cV = new MyListNode[4]; //Closest Values
		double distance =0;
		double smallestDistance = 1;
		cV[0] = head;
		cV[1] = head.getNext();
		while(cV[0].getNext() != null) {
			while (cV[1].getNext()!= null){
				cV[0].setX(cV[0].getX());
				distance = Math.pow((cV[0].getX()-cV[1].getX()), 2)+Math.pow((cV[0].getY()-cV[1].getY()),2);
				distance = Math.sqrt(Math.abs(distance));
				if(distance < smallestDistance) {
					smallestDistance = distance;
					cV[2] = cV[0];
					cV[3] = cV[1];
				}
				cV[1] = cV[1].getNext();
			}
			cV[0] = cV[0].getNext();
			if(cV[0].getNext()!=null) {cV[1] = cV[0].getNext();}		
		}
		StdOut.printf("\nThe two closest points to each other after rounding are (%.2f, %.2f) and (%.2f, %.2f).", cV[2].getX(), cV[2].getY(), cV[3].getX(), cV[3].getY());
		StdOut.printf("\nTheir true values are: (%f, %f) and (%f, %f).", cV[2].getX(), cV[2].getY(), cV[3].getX(), cV[3].getY());
		StdOut.printf("\nThe distance between these two points is: %f", smallestDistance);
		return 0.0;
	}
	public static void push(double x, double y) {
        if (isEmpty()) {
            head = new MyListNode(x, y, null);
            tail = head;
        }else {
            MyListNode oldHead = head;
            head = new MyListNode(x,y, null);
            head.next = oldHead;
        }
    }
	public static boolean isEmpty() {return head == null;}
}
