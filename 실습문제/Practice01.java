import java.util.Scanner;

public class Practice01 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //입출력 담당 - 외부로 부터 입력 받기 위해 - in : 시스템으로 부터 받아온다 - '.' 시스템 안에 있는 함수를 쓴다

        double kor = sc.nextDouble();
        if (!(kor >= 0 && kor <= 100)) { //! - 뒤에 있는 식을 반대로
            System.out.println("국어성적이 유효하지 않습니다.");
            return;

        }
        //참 -실행, 거짓-실행x / && - 왼쪽의 조건식과 오른쪽의 조건식이 같아야됨
        // return - 현재 있는 함수를 빠져나가는것 - 메서드

        double math = sc.nextDouble();
        if (!(math >= 0 && math <= 100)) {
            System.out.println("수학성적이 유효하지 않습니다.");
            return;
        }

        double eng = sc.nextDouble();
        if (!(eng >= 0 && eng <= 100)) {
            System.out.println("영어성적이 유효하지 않습니다.");
            return;
        }

        double score = (kor + math + eng) / 3;


        if (score >= 70) {
            System.out.println("합격");
        }

    }
}
