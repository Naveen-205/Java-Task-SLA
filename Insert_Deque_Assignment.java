package task;

import java.util.ArrayDeque;
import java.util.Deque;

public class Insert_Deque_Assignment {

	public static void main(String[] args) {
		
		Deque<Integer> d = new ArrayDeque<>();

		//Add Elements
		d.add(20);
		d.add(30);
		d.add(40);
		System.out.println("Add Elements: " + d);
		
		d.addFirst(10);
		System.out.println("Insert First Elements: " + d);
		
		
		d.addLast(50);
		System.out.println("Insert End Elements: " + d);
		
	}

}
