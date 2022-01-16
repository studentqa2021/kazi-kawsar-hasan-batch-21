package com.testRun;

public class Swapvariablepractice {

	
	public void getswap(int a,int b) {
		System.out.println("A value after swap="+a);
		System.out.println("A value after swap="+b);
		
		a=a+b;
		b=a-b;
		a=a-b;
	}
	public static void main(String[] args) {
		Swapvariablepractice obj =new Swapvariablepractice();
				obj.getswap(5, 10);
	}
}
