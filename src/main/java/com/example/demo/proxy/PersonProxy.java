package com.example.demo.proxy;

// 靜態代理
// 用來執行/調用「被代理者」的"業務"邏輯與實現/調用"公用"邏輯
public class PersonProxy implements Person {
	
	// 代理對象(被代理者)
	private Person person;
	
	public PersonProxy(Person person) {
		this.person = person;
	}
	
	@Override
	public void work() {
		// 實現公用邏輯
		System.out.println("出門戴口罩");
		System.out.println("量體溫");
		// 調用業務邏輯
		person.work();
		// 實現公用邏輯
		System.out.println("回家脫口罩");
		
	}
	
}
