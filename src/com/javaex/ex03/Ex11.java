package com.javaex.ex03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요");
		int month = sc.nextInt();
		int days;
						//char, byte, int, short, String 가능
		switch(month) { //boolean, double, float, long 안 됨 
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			break;
		
		case 2:
			days = 28;
			break;
			
		default: 
			days = 31;
			break;
		}
		
		System.out.println(days + "일 입니다.");
		sc.close();

	}

}

/*	switch(month) {
		case 1: 
			int num =3; <<if문과 다르게 사라지는 것이 아니라서 변수 이름을 다 다르게 주어야 한다.
			system.out.println("31일 입니다."); 
			break;
		case 2: 
		{  변수 이름을 다르게 넣는 게 싫다면 if 문법을 사용하거나 중괄호를 넣어준다. 
			int num =3; 
			system.out.println("28일 입니다."); 
			break;
		}
		case 3: 
			system.out.println("31일 입니다."); 
			break;
		case 4: 
			system.out.println("30일 입니다."); 
			<<break가 없다면 case 4를 입력하면 30일과 31일 두 가지가 나온다. 
		case 5: 
			system.out.println("31일 입니다."); 
			break;
		case 6: 
			system.out.println("30일 입니다."); 
			break;
		case 7: 
			system.out.println("31일 입니다."); 
			break;
		case 8: 
			system.out.println("31일 입니다."); 
			break;
		case 9: 
			system.out.println("30일 입니다."); 
			break;
		case 10: 
			system.out.println("31일 입니다."); 
			break;
		case 11: 
			system.out.println("30일 입니다."); 
			break;
		case 12: 
			system.out.println("31일 입니다."); 
			break;
*/			

