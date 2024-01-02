package com.javaex.ex05;

public class Ex06 {

	public static void main(String[] args) {
		
		//A 배열선언
		int[] arrA = new int[3];
		
		arrA[0] = 3;
		arrA[1] = 6;
		arrA[2] = 9;
		
		//B 배열선언
		int[] arrB = new int[3];
		
		//A주소 B에 대입
		arrB = arrA;
		
		//배열A 출력
		System.out.println("arrA[]");
		for(int i=0; i<arrA.length; i++) {
			System.out.println("i= " + arrA[i]);
		}
		System.out.println("-----------");
		
		//배열B 출력
		System.out.println("arrB[]");
		for(int i=0; i<arrB.length; i++) {
			System.out.println("i= " + arrB[i]);
		}
		System.out.println("-----------");
		
		//arrA[0]의 값을 99로 변경
		//arrA arrB 전체출력
		//두 배열의 값이 같으면 주소가 같다.
				
		arrA[0] = 99;
		for(int i=0; i<arrA.length; i++) {
			System.out.println(arrA[i]);
		}
		System.out.println("-----------");
		
		for(int i=0; i<arrB.length; i++) {
			System.out.println(arrB[i]);
		}
		
	}

}
