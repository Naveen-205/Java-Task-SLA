package task;

import java.util.LinkedList;

public class LinkedList_Assignment {
	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>();
		
		//Add elements
		list.add(20);
		list.add(30);
		list.add(40);
	
		
		//At the Beginning
		list.addFirst(10);
		
		//At the End
		list.addLast(50);
		
		
		System.out.println(list);
		
		
	}
}
