package com.javaex.ex03;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int labor = sc.nextInt();
		
		if(labor>8) {
			double overlabor = 8*10000 + (labor-8)*10000*1.5;
			System.out.println("임금은 " + (int)overlabor + " 입니다.");
		} else {
			System.out.println("임금은 " + labor*10000 + " 입니다.");
		}

		sc.close();
	}

}
