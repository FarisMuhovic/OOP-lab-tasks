package lab01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1.
//		System.out.println("Jane Doe");
		// 2.
//		System.out.println("Hello world");
//		System.out.println("(and all the people of the world)");
		// 3.
//		System.out.println("There are " + (365*24*60*60) + " in a year.");
		// 4.
		Scanner sc = new Scanner(System.in);
//		System.out.println("Type a number: ");
//		int x  = sc.nextInt();
//		System.out.println("Type another number: ");
//		int y  = sc.nextInt();
//		System.out.println("Sum of the numbers: " + (x + y));
		// 5.
//		System.out.println("Type a number: ");
//		int z  = sc.nextInt();
//		System.out.println("The number is " +( z < 0 ? "not" : "") + " positive");
		// 6.
		System.out.println("Type a number: ");
		int x  = sc.nextInt();
		System.out.println("Type another number: ");
		int y  = sc.nextInt();
		if (x > y) {
			System.out.println("Greater number: " + x);
		} else if (x == y) {
			System.out.println("The numbers are equal");
		} else {
			System.out.println("Greater number: " + y);
		}
		
	}

}
