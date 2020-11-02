package com.java.practice;

import java.util.Scanner;

public class NumberSeries1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		//0,0,7,6,14,12,21,18, 28
		sc.close();
		int first = 0, second = 0;
		
		for(int i=0;i<n;i++) {
			if(i%2==0) {
				first +=6;
			}
			else {
				second +=7;
			}
			
			
		}
		System.out.println(second);
	}

}
