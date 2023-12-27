package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int labor = sc.nextInt();
		
		if(labor>8) {
			int overlabor = 8*10000 + (labor-8)*12000;
			System.out.println("임금은 " + overlabor + " 원 입니다.");
		} else {
			System.out.println("임금은 " + labor*10000 + " 원 입니다.");
		}

		sc.close();
	}

}

/* 결과 출력을 하나로
 public class Ex04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int labor = sc.nextInt();
		int totallabor; <<써놓지 않으면 if절 끝나고 사라짐
		
		if(labor>8) {
			totallabor = 8*10000 + (labor-8)*12000;
			
		} else {
			totallabor = labor*10000;
		}

		System.out.println("임금은 " + totallabor + " 원 입니다.");
		sc.close();
	}

}
*/

