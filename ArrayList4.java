package task;
import java.util.ArrayList;

public class ArrayList4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();

        // Adding elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        int sum = 0;

        // Calculate sum
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }

        // Display result
        System.out.println("Sum of elements: " + sum);
		

	}

}
