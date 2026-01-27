package task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Console_App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Enter an Integer:");
			int num = sc.nextInt();
			System.out.println("You Entered " + num);
		}
		catch(InputMismatchException e) {
			System.out.println("Input Mismatch Exception! Please Enter Numbers Only");
		}
		sc.close();
	}

}
