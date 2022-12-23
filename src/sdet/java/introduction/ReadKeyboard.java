package sdet.java.introduction;

import java.util.Scanner;

public class ReadKeyboard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 2 Numbers");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		int sum = num1 + num2;
		System.out.println("Sum of " + num1 + " and " + num2 + " is  " + sum);

		int difference = num1 - num2;
		System.out.println("Difference of " + num1 + " and " + num2 + " is  " + difference);

		int multiplication = num1 * num2;
		System.out.println("Multiplication of " + num1 + " and " + num2 + " is  " + multiplication);

		int division = num1 / num2;
		System.out.println("Division of " + num1 + " and " + num2 + " is  " + division);

	}

}
