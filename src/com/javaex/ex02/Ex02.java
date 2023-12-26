package com.javaex.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//안내 출력
		System.out.println("이름을 입력해주세요");
		
		//이름 출력
		System.out.print("이름:");
		
		//이름 입력받기
		String name = sc.nextLine();
		
		//결과 출력 
		System.out.println("당신의 이름은 " + name + " 입니다.");
		
		sc.close();
		

		System.out.println("나이를 입력해주세요");
		
		System.out.print("나이: ");
		
		int age = sc.nextInt();
		
		System.out.println("당신의 나이는 "+ age + "입니다.");	
		
		sc.close();
		
		
	}

}
