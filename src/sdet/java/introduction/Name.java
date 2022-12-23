package sdet.java.introduction;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("May I know your name ?? ");
		name = sc.nextLine();

		System.out.println("Hello, " + name);

	}

}
