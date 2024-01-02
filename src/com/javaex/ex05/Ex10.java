package com.javaex.ex05;

public class Ex10 {

	//자바가 해줌 String args = new String[3];
	public static void main(String[] args) {
		
		for(int i = 0; i<args.length; i++) {
			System.out.println(i + " 번째 값: " + args[i]);
		}

	}

}
