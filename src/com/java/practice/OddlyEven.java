package com.java.practice;

import java.util.Scanner;

public class OddlyEven {
//	static long fun(long n) {
//		long result = 0,even = 0,odd = 0,count=1;
//		long temp = n;
//		while(n>0) {
//			if(count%2==0) {
//				temp = n%10;
//				even = even+temp;
//				//System.out.println("even"+even);
//				n/=10;
//				count++;
//			}
//			else {
//				temp = n%10;
//				odd = odd+temp;
//				//System.out.println("odd"+odd);
//				n/=10;
//				count++;
//			}
//		}
//		result = odd-even;
//		return result;
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		
//		long n = sc.nextLong();
//		
//		
//		System.out.println(fun(n));
//		sc.close();
//	}
public static void main(String[] args) {
	Scanner sin = new Scanner(System.in);
	String s=sin.nextLine();
	
            long num = 0, num1 = 0;
	num=num + s.charAt(0)-'0';
	
            for(int i=1;i<s.length();i++)
	{
	    if(i%2==0)
	        num = num + s.charAt(i)-'0';
	   else
	     num1 = num1 + s.charAt(i)-'0';
	}
	System.out.println(Math.abs(num-num1));
}
}


