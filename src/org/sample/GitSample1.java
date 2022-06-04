package org.sample;

import java.util.Scanner;

public class GitSample1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		
		if (num%6==0) {
			System.out.println("Number is Divisible by 6");
		}
		else {
			System.out.println("Number is not Divisible by 6");
		}
	}
}
