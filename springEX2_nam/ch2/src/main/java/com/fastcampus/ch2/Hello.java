package practice.springEX2_nam.ch2.src.main.java.com.fastcampus.ch2;


//1. 원격 호출가능한 프로그램으로 등록
@Controller
public class Hello {
	int iv = 10; // 인스턴스 변수
	static int cv = 20; // static 변수

	//2. URL과 메서드를 연결
	@RequestMapping("/hello")
	private void main() { // 인스턴스 메서드 - iv, cv를 둘다 사용가능
		System.out.println(" Hello - privata "); // 톰캣 콘솔에 출력함
//		System.out.println(iv); //ok
		System.out.println(cv); //ok
	}

	public static void main2() {// static 메서드 - cv만 사용가능
//		System.out.println(iv); // 에러남
		System.out.println(cv); //ok

	}

}
//System.out.println > 콘솔에 출력