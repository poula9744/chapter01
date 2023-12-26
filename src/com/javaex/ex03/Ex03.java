package com.javaex.ex03;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		int point = sc.nextInt();
		
		if(point>0) {
			System.out.println("양수"); //양수일때
		} else if(point<0) {
			System.out.println("음수"); //음수일때
		} else if(point==0) {
			System.out.println("0입니다"); //0일때
		}
		
		sc.close();
		//
		
		

	}

}
