package com.javaex.ex05;

public class Ex08 {

	public static void main(String[] args) {

		int[] leftArray = new int[] { 10, 20, 30 };
		int[] rightArray = new int[] { 30, 20, 10};

		for (int i = 0; i < leftArray.length; i++) {
			if (leftArray == rightArray) { // 동일한 경우

			} else if (leftArray[i] != rightArray[i]) { // i 번째 크기가 다른경우
				System.out.println(i + " 번째 값이 다릅니다.");
			}
		}
		// 배열의 크기가 다른 경우
		if (leftArray.length != rightArray.length) {
			System.out.println("두 배열의 크기가 다릅니다.");
		}
	}

}
