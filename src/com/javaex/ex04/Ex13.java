package com.javaex.ex04;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		int sum = 0; 
		int no;
		Scanner sc =new Scanner(System.in);
		System.out.println("숫자를 입력하세요 [0이면 종료]");
		
		
		do {
			no = sc.nextInt();
			sum = sum + no;
			System.out.println("합계 " + sum);
		} while(no != 0);

		
		
/*		while(true) {
			int no = sc.nextInt();
			if(no==0) {
				System.out.println("종료");
				break;
			} 
				sum = sum + no;
				System.out.println("합계: " + sum);
			}
*/
		
		sc.close();

	}

}

