package OOP;

public class ex6_5 {
    public static void main(String[] args) {
        System.out.println("HELLO");
    }
}
// 호출스택 > 메서드의 작업에 필요한 메모리 공간을 제공함
// 1. 메서드가 호출 > 수행에 필요한 만큼의 메모리를 스택에 할당받음
// 2. 메서드가 수행을 끝냄 > 사용했던 메모리 반환, 스택에서 제거
// 3. 호출스택 제일 위에 있는 메서드 > 현재 실행 중인 메서드
// 4. 아래있는 메서드 > 바로 위의 메서드를 호출한 메서드
