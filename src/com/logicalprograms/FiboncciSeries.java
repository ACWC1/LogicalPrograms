package com.logicalprograms;

import java.util.Scanner;

public class FiboncciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the Number to find Fibonacci Series : ");
		int num = scanner.nextInt();
		int num1 = 0;
		int num2 = 1;
		int sum = 0;
		
		System.out.println(num1);
		System.out.println(num2);
		
		while (num > 2)
		{
			sum = num1 + num2;
			System.out.println(sum);
			num1 = num2;
			sum = num2;
			num --;
		}
		scanner.close();

	}

}
