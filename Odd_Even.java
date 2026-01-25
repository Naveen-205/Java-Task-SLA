package task;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		
		System.out.println("Enter the Number: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num%2==0) {
			System.out.println(num + " is Even Number");
		}
		else {
			System.out.println(num + " is Odd Number");
		}
		sc.close();
	}

}

