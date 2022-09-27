import java.util.Scanner;

public class practice_2588 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력 세자리수 * 세자리 수
        int A = sc.nextInt();
        int B = sc.nextInt();

        sc.close();

        System.out.println( A* (B%10) );
        System.out.println( A* (B%100/10) );
        System.out.println( A*(B/100) );
        System.out.println( A*B );

    }
}
