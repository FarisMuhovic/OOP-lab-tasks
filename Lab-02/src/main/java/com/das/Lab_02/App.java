package com.das.Lab_02;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
		//	1.Create a program that asks the user for a password. 
		//	 If the password is right, a secret message is shown to the user.
		
//		while (true) {
//			System.out.print("Enter a password: ");
//			String password = sc.next();
//			if (password.equals("faris")) {
//				System.out.println("Right! ");
//				System.out.print("The secret is: ");
//				System.out.print("fasdlmgk");
//				break;
//			} else {
//				System.out.println("Wrong! ");
//				}
//		}
		
		// 2.Create a program that asks the user for three numbers and then prints their sum. 
		// Use the following structure in your program:
		
//		int sum = 0;
//		int i = 0;
//		while (i < 3) {
//			System.out.print("Enter a number: ");
//			sum += sc.nextInt();
//			i++;
//		}
//		System.out.println("The sum is: " + sum);
		
		// 3.Create a program that reads numbers from the user and prints their sum.
		// The program should stop asking for numbers when the user enters the number 0. 
		// The program should be structured like this:
		
//		int sums = 0;
//		while (true) {
//			int num = sc.nextInt();		
//			sums += num;
//			System.out.println("Sum now is: "+sums);
//			if (num == 0) {
//				System.out.println("Final sum is: "+sums);
//				break;
//			} 
//		}
		
		// 4. Create a program that asks the user for the first number and the last number
		// and then prints all numbers between those two. Use a while loop. If the first 
		 // number is greater than the last number, the program prints nothing:
		
//		System.out.print("First: ");
//		int a = sc.nextInt(); // 5
//		System.out.print("Last: ");
//		int b = sc.nextInt();	// 8
//		while (a <= b) {
//			System.out.println(a);
//			a++;
//		}
		
		//5.Create a program that calculates the sum of 20+21+22+...+2n, where n is a number 
		//entered by the user. The notation 2i means raising the number 2 to the power of i, for
		//example 24 = 2*2*2*2 = 16. In Java we cannot write ab directly, but instead we can 
		//calculate the power with the command Math.pow(number, power). 
		//Note that the command returns a number of double type (i.e. floating point number)
		//. A double can be converted into the int type (i.e. whole number) as follows:
		//int result = (int)Math.pow(2, 3). This assigns the value of 23 to variable result. 
		
//		System.out.println("Enter power to the: ");
//		double pow = sc.nextInt();
//		System.out.println("The result is: " + (int)Math.pow(2, pow));
		
		//6.Create a method printText that prints the following string of characters: 
		// "In the beginning there were the swamp, the hoe and Java." and a line break.
//		System.out.print("How many times do you want to print the text: "); 
//		int times = sc.nextInt();
//		for (int i = 0; i < times; i++) {
//			printText();
//		}
		//7.Create a method printStars that prints the given amount of stars and a line break. 
		
//		printStars(10);
//		printStars(5);
//		printStars(3);
		
		//8.Create a method called drawStarsPiramid that will accept the number 
		// of rows as a parameter and print a half piramid shape where the number 
		// of rows will be dictated by the sent parameter. 
		
		//drawStarPyramids(5);
		// Inverted
//		inverteddrawStarPyramids(5);
		
		//9.Modify the previously created starts piramid in a way that now
		//you are not printing the starts but in each row numbers from 1 to the current row count.
		
//		drawNumbersPiramid(5);
		
		//10. TOO MUCH TEXT
		int guesses = 0;
		int randomnumber = randomNumber();

		while (true) {
			System.out.print("Guess a number: ");
			int guess = sc.nextInt();		
			guesses++;
			if (guess == randomnumber) {
				System.out.println("Congratulations your guess is correct, It took you " + guesses + " guesses");
				break;
			}  else {
				if (randomnumber < guess) {
					System.out.println("The number is lesser, guesses made: " + guesses );
				} else {
					System.out.println("The number is higher, guesses made: " + guesses );
				}
			}
			
		}
	}
	//6.
	
//	public static void printText() {
//		System.out.println("In the beginning there were the swamp, the hoe and Java." );
//	}
	
	//7.
	
//	private static void printStars(int amount) {
//		for (int i = 0; i < amount; i++) {
//		System.out.print("*");
//		}
//		System.out.println();
//	}
	//8.
	
//	private static void drawStarPyramids(int rows) {
//		for (int i = 0; i < rows; i++) {
//			for (int j = 0; j <= i; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
	// inverted
	
//	private static void inverteddrawStarPyramids(int rows) {
//		for (int i = 0; i < rows; i++) {
//			for (int j = rows - i; j >0; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}

	//9.
//	private static void drawNumbersPiramid(int rows) {
//	for (int i = 0; i < rows; i++) {
//		for (int j = 0; j <= i; j++) {
//			System.out.print(j+1);
//			// for task b change j+ 1 to i+1;
//			//System.out.print(i+1);
//		}
//		System.out.println();
//	}
//}
	//10.
	public static int randomNumber() {
		return  (int) (Math.random() * 100);
	}
}
