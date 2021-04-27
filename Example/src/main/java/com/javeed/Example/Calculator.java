package com.javeed.Example;

public class Calculator {
	private int num1;
	private int num2;
	
	public Calculator(double num1,double num2) {
		this.num1 = (int)num1;
		this.num2 = (int)num2;
		System.out.println("Constructor : dbl dbl ");
	}
	public Calculator(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
		System.out.println("Constructor : int int ");
	}
	public Calculator(String num1, String num2) {
		this.num1 = Integer.parseInt(num1);
		this.num2 = Integer.parseInt(num2);
		System.out.println("Constructor : str str ");
	}
	public void m1() {
		System.out.println("num1 :"+ num1);
		System.out.println("num1 :"+ num2);
		System.out.println("num :"+ (num1 + num2));	
		
	}
	

}
