package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		int result = 0;
		
		for(int i=2; i<=9; i++) {
			for(int z=1; z<=9; z++) {
				result = i*z;
	
				
				System.out.println(i + "*" +z+  "=" + result);
			}
		}
	}
}
