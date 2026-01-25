package task;

import java.util.ArrayDeque;
import java.util.Deque;

public class Remove_Dequeue_Assignment {

	public static void main(String[] args) {
		
		Deque<String> d = new ArrayDeque<>();
		
		//Add Elements
		d.add("Aeroplane");
		d.add("Boat");
		d.add("Car");
		d.add("Van");
		d.add("Bike");
		System.out.println("Add Elements: " + d);
		
		//Remove Both Ends
		d.removeFirst();
		d.removeLast();
		System.out.println("After Removing: " + d);

	}

}
