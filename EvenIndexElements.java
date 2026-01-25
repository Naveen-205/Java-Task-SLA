package task;

import java.util.Scanner;

public class EvenIndexElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Elements at even index positions:");
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
        }
        sc.close();
    }
}

