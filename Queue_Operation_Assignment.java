package task;

import java.util.ArrayDeque;
import java.util.Queue;

public class Queue_Operation_Assignment {

	public static void main(String[] args) {
		
		Queue<Integer> q = new ArrayDeque<>();
		
		//Add elements
		q.add(10); 
		q.add(20); 
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
				
		System.out.println("Removed Queue is: " + q.remove());
		System.out.println(q);
		System.out.println("Element Queue is: " + q.element());
		System.out.println(q);
		System.out.println("Offer Queue is: " + q.offer(60));
		System.out.println(q);
		System.out.println("Poll Queue is: " + q.poll());
		System.out.println(q);
		System.out.println("Peek Queue is: " + q.peek());
		System.out.println(q);

	}

}
