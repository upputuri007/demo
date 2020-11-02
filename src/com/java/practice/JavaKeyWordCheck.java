package com.java.practice;

import java.util.Scanner;

public class JavaKeyWordCheck {
	static void checkKeyword(String str) {
		String[] keyString = {"break", "case", "continue","default","defer", "else", "for", "func", "goto",
				"if", "map", "range", "return", "struct", "type", "var"};
		int flag = 0;
		for(String obj:keyString) {
			if(str.equals(obj)) {
				//System.out.println(obj);
				flag = 1;
						//System.out.println(flag);
				break;
			}
			else {
				//System.out.println(obj);
				flag = 0;
				//System.out.println(flag);
				continue;
			}
		}
		
		if (flag == 1) {
			System.out.println("Entered string is a keyword");
		} else {
			System.out.println("Entered String is not a keyword");
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Entered a String to check wheather it is a keyword or not");
		
		
		String str = scanner.next();
		checkKeyword(str);
		
		scanner.close();
		
		
				
	}

}
