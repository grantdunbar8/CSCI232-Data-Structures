package ProblemSet1;
import java.util.Scanner;

public class Problem2 {
	private static Node head;
	private static Node tail;
	public static void main (String args[] ) {
		StdOut.print(Parentheses());
	}
	public static boolean Parentheses() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the string you would like to check to see if it is balanced:");
		String holder = keyboard.nextLine();
		for(int i = 0; i < holder.length(); i++) {
			if(holder.charAt(i) != '}' && holder.charAt(i) != ')' && holder.charAt(i) != ']') {
				push(holder.charAt(i));
			}else {
				if(holder.charAt(i) == '}') {
					if(head.getChar() != '{') {return false;}else {pop();}
				}else if(holder.charAt(i) == ']') {
					if(head.getChar() != '[') {return false;}else {pop();}
				}else if(holder.charAt(i) == ')') {
					if(head.getChar() != '(') {return false;}else {pop();}
				}
				
			}
		}
		return true;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static Node pop() {
        Node first;
        first = head;
        head = head.next;
        if (tail == first) {
            tail = head;
        }
        return first;
    }
	
	public static void push(char c) {
        if (isEmpty()) {
            head = new Node(c, null);
            tail = head;
        }else {
            Node oldHead = head;
            head = new Node(c, null);
            head.next = oldHead;
        }
    }
	public static boolean isEmpty() {return head == null;}

}
