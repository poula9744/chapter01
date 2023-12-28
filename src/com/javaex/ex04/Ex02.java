package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//입력
		
		System.out.println("단을 입력해주세요");
		System.out.print("단: ");
		int dan = sc.nextInt();
		int i = 1;
		
		//반복
		
		while(i<=9) {
			
			System.out.println(dan+" * "+ i + " = " + dan*i);
			
			i++;
		} 

		sc.close();
	}

}
/*
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	//입력
	
	System.out.println("단을 입력해주세요");
	System.out.print("단: ");
	int dan = sc.nextInt();
	int i = 0; <<기계가 꼭 0으로 시작해야 한다면 (반복만 시키는 용도)
	int time = 1; <<새로운 변수를 넣는다. 
	
	//반복
	
	while(i<9) {
		
		System.out.println(dan+" * "+ time + " = " + dan*time);
		//system.out.println(dan+" * "+ (i+1) + " = " + dan*(i+1)); <<또는 i+1로 만들어도 됨
		
		i++;
	} 

	sc.close();
}
*/
