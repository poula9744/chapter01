package com.javaex.ex05;

public class Ex09 {

	public static void main(String[] args) {
		
		int[] leftArray = new int[] {10, 20, 30};
		int[] rightArray = new int[] {10, 20, 30};
		
		//방 갯수 비교
		if(leftArray.length == rightArray.length) {
			//방의 갯수가 같은 경우
			//세부검사
			for(int i =0; i<leftArray.length; i++) {
				if(leftArray[i] != rightArray[i]) {
					System.out.println(i +" 번째 값이 다릅니다.");
				}
			}
		} else { 
			//방의 갯수가 다른 경우
			System.out.println("두 배열의 크기가 다릅니다.");
		}

	}

}
