package com.javaex.ex04;

public class Ex12 {
	public static void main(String[] args) {
		
		//방법 1: continue 사용
		for(int i=1; i<=20; i++) {
			
			if(i%2==0 || i%3==0) {
				continue;
			} 
			System.out.println(i);
		}	
		System.out.println("==========================");
		
		//방법2:
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				
			} else {
				System.out.println(i);
			}
		}
		
		System.out.println("==========================");
		
		//방법3:
		for(int i=1; i<=20; i++) {
			if(!(i%2==0||i%3==0)) {
				System.out.println(i);
			}
		}
		
		
		
		
		
	}
	
	
}

