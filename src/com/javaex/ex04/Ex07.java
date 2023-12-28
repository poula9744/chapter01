package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		int result = 0;
		
		//dan 반복 (2~9)
		for(int dan=2; dan<=9; dan++) {
			
			//d 반복(1~9)
			for(int d=1; d<=9; d++) {
				result = dan*d;
	
				System.out.println(dan + " * " + d +  " = " + result);
			}
		}
	}
}
