package task;
import java.util.Scanner;

public class Words_Count {

	public static void main(String[] args) {
		
		System.out.println("Enter a Sentence:");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		int count = str.split(" ").length;
	
	
		System.out.print("Number of Word is " + count);
		sc.close();
	}

}
