package com.javaex.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		//스캐너 준비
		Scanner sc = new Scanner(System.in); // 스캐너 하나만 올려두고 계속 써도 됨 
		                                     // sc하고 옆에 빨간버튼 클릭해서 Library 열어주기 
		//안내문구
		System.out.println("이름을 입력해 주세요.");
		//이름:
		System.out.print("이름: ");
		//이름입력받기
		String name = sc.nextLine();
	
		//안내문구
		System.out.println("나이를 입력해 주세요.");
		//나이: 
		System.out.print("나이: ");
		//나이입력받기
		int age = sc.nextInt();
		//출력
		System.out.println(name); //헷갈리니까 확인용
		System.out.println(age);
		
		System.out.println("당신의 이름은 " + name + " 나이는 " + age + " 입니다.");
		
		//스캐너 종료
		sc.close();
		

		
	}

}
