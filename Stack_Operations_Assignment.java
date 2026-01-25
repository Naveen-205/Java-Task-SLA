package task;

import java.util.Stack;

public class Stack_Operations_Assignment {

	public static void main(String[] args) {
		
		Stack<Integer> st = new Stack<>();
		
		//Push elements
		st.push(11);
		st.push(22);
		st.push(33);
		st.push(44);
		st.push(55);
		
		System.out.println("Push Elements: " + st);
		
		//Pop Elements
		System.out.println("Pop Elements: " + st.pop());
		System.out.println("After Pop: " + st);
		
		//Peek Elements
		System.out.println("Peek Elements: " + st.peek());
		
	}

}
