package com.java.practice;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		scanner.close();
		leapYear(year);
	}

	private static void leapYear(int year) {
		// TODO Auto-generated method stub
		boolean a = (year%4==0)?(year%100!=0):(year%400==0)?true:false;
		
		if(a == true) {
			System.out.println("leaf year");
		}
		else {
			System.out.println("not a leaf year");
		}
	}

}
