package com.java.practice;

import java.util.Scanner;

public class NthTermOfSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243,64, 729, 128, 2187 
		
		Scanner scanner = new Scanner(System.in);
		 int n = scanner.nextInt();
		 int temp = 1;
		 for(int i=1;i<=n-2;i++) {
			 if(i%2==0) {
			 temp = 2*temp;}
			 else {
				 temp = 3*temp;
			 }
		 }
		 
		 System.out.println(temp);
	}

}
