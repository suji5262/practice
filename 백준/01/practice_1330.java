import java.util.Scanner;

public class practice_1330 {
    public static void main(String[] args) {

        int A;
        int B;
        String grade;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        if ( A>B ) {
            grade = ">";
        } else if ( A<B ) {
            grade = "<";
        } else {
            grade = "==";
        }
        System.out.println(grade);
    }
}
