package com.example.demo.proxy;

public class CalcTest {
	
	public static void main(String[] args) {
		Calc calc = new CalcImpl();
		Calc calcProxy = new CalcProxy(calc);
		// 加法
		System.out.println(calcProxy.add(10, 20));
		System.out.println(calcProxy.add(null, 20));
		// 除法
		System.out.println(calcProxy.div(20, 10));	// 顯示 2
		System.out.println(calcProxy.div(null, 10));	// 會顯示 x,y 必需要有資料
		System.out.println(calcProxy.div(20, 0));	// 會顯示分母 y 不可 = 0

	}
}
