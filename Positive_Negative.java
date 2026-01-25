package task;
import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number:");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println(num + " is Positive Number");
		}
		else if(num<0) {
			System.out.println(num + " is Negative Number");
		}
		else {
			System.out.println(num + " is Zero");
		}
		sc.close();
	}

}
