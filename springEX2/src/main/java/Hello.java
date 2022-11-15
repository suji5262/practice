package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

// 1. 원격 호출가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10;
	static int cv = 20;
	
	//2. URL과 메서드를 연결
	@RequestMapping("/hello")
	public void main() { //인스턴스 메서드 - iv, cv 모두 사용가능
		System.out.println("Hello - private");
		System.out.println(cv);
//		System.out.println(iv);
		// 가능하면!
	}
	
	public static void main2() { // static메서드 - cv만 사용가능
		System.out.println(cv); // ok
	   //System.out.println(iv); // 에러
		

	}
}
