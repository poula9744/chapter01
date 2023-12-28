package com.javaex.ex04;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//반복 
		while(true) {
			//숫자 입력
			System.out.println("숫자를 입력하세요");
			int num = sc.nextInt();
			
			//3의 배수인지 판별
			if(num%3==0 && num != 0) {
				System.out.println("3의 배수입니다.");
			} else if(num==0) { //0입력하면 종료
				System.out.println("종료");
				break;
			} else {
				System.out.println("3의 배수가 아닙니다.");
				
			}
			
		}

		sc.close();
	}

}

/*
 * public static void main(String[] args) {
		
		while(true) {
			System.out.println("숫자: ");
			int no = sc.nextInt();
			
			if(no==0) {
				break;
			}
			
			if(no%3==0)	{
				System.out.println("3의 배수입니다.");
			} else {
				System.out.println("3의 배수가 아닙니다.");
			}
		}
		
		sc.close;
*/
