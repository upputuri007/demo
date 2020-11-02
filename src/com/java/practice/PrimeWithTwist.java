package com.java.practice;

import java.util.Scanner;

public class PrimeWithTwist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		sc.close();
		if(n<0) {
			System.out.println("no");
		}
		else {
			fun(n);
		}
	}

	private static void fun(int n) {
		// TODO Auto-generated method stub
		if(n == 2) {
			System.out.println("Prime Number");
			return;
		}
		
		if(n % 2!=0 && n%n==0) {
			System.out.println("Prime Number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
	}

}
