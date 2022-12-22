import java.util.Scanner;

public class practice_9498 {
    public static void main(String[] args) {

//        int score = 0;
//        char grade =' ';
//
//        System.out.printf("시험점수를 입력해주시오 ->");
//
//        Scanner sc = new Scanner(System.in);
//        score =sc.nextInt();
//        sc.close();
//
//
//        if (score >= 90) {
//            grade = 'A';
//        } else if (score >= 80) {
//            grade = 'B';
//        } else if (score >= 70) {
//            grade = 'C';
//        } else if (score >=  60) {
//            grade = 'D';
//        } else {
//            grade = 'F';
//        }
//        System.out.println("당신의 시험점수는 " + grade + "입니다.");
//
//    }

            int score = 0;
            char grade =' ';

            Scanner sc = new Scanner(System.in);
            score =sc.nextInt();
            sc.close();

            if (score >= 90) {
                grade = 'A';
            } else if (score >= 80) {
                grade = 'B';
            } else if (score >= 70) {
                grade = 'C';
            } else if (score >=  60) {
                grade = 'D';
            } else {
                grade = 'F';
            }
            System.out.println(grade);

        }
}
