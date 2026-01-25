package task;

import java.util.Iterator;
import java.util.HashSet;
import java.util.Set;

public class Set_Iterator_Assignment {

	public static void main(String[] args) {
		
		Set<String> obj = new HashSet<>();
		
		//Add elements
		obj.add("Apple");
		obj.add("Banana");
		obj.add("Orange");
		obj.add("Graphs");
		obj.add("Mango");	
		System.out.println("Set Elements: " + obj);
		
		
		//Remove elements
		obj.remove("Graphs");
		System.out.println("After Removing Elements: " + obj);
		
		//Checking Presence
		System.out.println("Contains Graphs?: " + obj.contains("Graphs"));
		
		//Size
		System.out.println("Size of the Set: " + obj.size());
		
		//Iterator
		Iterator<String> itr = obj.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
