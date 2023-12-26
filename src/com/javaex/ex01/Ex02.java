package com.javaex.ex01;

public class Ex02 {

	public static void main(String[] args) {
		
		//byte
		byte no = 127;
		
		//no = -129;   //byte형의 범위를 벗어남
		
		System.out.println(no);
		
		/////////////////////////////////////
		//int
		int num = -2147483648;
		
		System.out.println(num);
		
		
		/////////////////////////////////////
		//long
		//int의 범위를 벗어난 숫자는 맨뒤에 L을 붙여야한다
		//팁 항상L
		long num2 = 2147483648L;
		System.out.println(num2);
		
		
		////////////////////////////////////
		//변수선언, 초기화
		////////////////////////////////////
		
		//변수선언
		int var01;
		int var02;
		int var03;
		//int var01, var02, var03;
		
		//초기화 대입
		var01 = 10;
		var02 = 20;
		var03 = 30;
		
		//출력
		System.out.println(var01);
		System.out.println(var02);
		System.out.println(var03);
		
		///////////////////////////
		int var04 = 100;
		int var05 = 200;
		int var06 = 300;
		//int var04=100, var05=200, var06=300;
		
		
		
		
	}
	
}
