package task;

import java.util.Set;
import java.util.HashSet;

public class Set_Assignment {

	public static void main(String[] args) {
		
		Set<Integer> empID = new HashSet<>();
		
		//Adding Employee ID 
		empID.add(101);
		empID.add(102);
		empID.add(103);
		empID.add(104);
		empID.add(105);
		
		//Duplicate Employee ID 
		empID.add(102);
		empID.add(103);
		empID.add(104);
		
		System.out.println("Employee ID: " + empID);

	}

}
