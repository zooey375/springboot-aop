// 不寫公用邏輯但又會出現 -> proxy
package com.example.demo.proxy;

public class Woman implements Person{

	@Override
	public void work() {
		// 公用邏輯(跟上班無關，需要但又不相關)
		//System.out.println("出門戴口罩"); (寫PersonProxy 就不用寫這個)

		// 業務邏輯
		System.out.println("Woman 市場買菜");
		
		// 公用邏輯(跟上班無關，需要但又不相關)
		//System.out.println("回家脫口罩");

	}
}
