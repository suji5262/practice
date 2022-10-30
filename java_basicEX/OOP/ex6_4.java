package java_basicEX.OOP;

public class ex6_4 {
    public static void main(String[] args) {

        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L); // 더하기
        long result2 = mm.subtract(5L, 3L); // 빼기
        long result3 = mm.multiply(5L, 3L); // 곱하기
        double result4 = mm.divide(5L, 3L);// 나누기
        // 더블 대신 롱값으로 호출하였다, 이값은 더블로 자동형변환함

        System.out.println("add(5L, 3L) = " + result1);
        System.out.println("subtract(5L, 3L) = " + result2);
        System.out.println("multiply(5L, 3L) = " + result3);
        System.out.println("divide(5L, 3L) = " + result4);
    }
}

class MyMath {
    long add(long a, long b) {
        long result = a + b;
        return result;
        // return a+b; > 위의 두줄을 한줄로 간단히!
    }

    long subtract(long a, long b) {return a-b; }
    long multiply(long a, long b) {return a*b; }
    double divide(double a, double b) {return a/b; }

    // 메서드 - 클래스 영역안에서만 정의 가능
    // 작업을 마치면 호출한 곳으로 돌아감
}

// 1. 클래스 작성 - MyMath
// 2. 객체생성 - MyMath mm = new MyMath();
// 3. 객체사용 - 덧셈, 뺄셈, 곱셈, 나눗셈