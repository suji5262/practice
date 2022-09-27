import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {

        // 임의의 두 수 a, b와 연산자 (+,-,/,%)중 한문자 입력받아서 계산 결과를 출력해보자
        //ex 입력         출력
        //   2 5 -       -3
        //   4 3 *        12
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 값: ");
        int a = sc.nextInt();

        System.out.println("두번째 값: ");
        int b = sc.nextInt();

        System.out.println("(+,-,/,%,*)중 연산자를 선택해주세요.");
        String op = sc.next();

        if (op.equals("+")){ System.out.println(a+b);
        } else if (op.equals("-")) { System.out.println(a-b);
        } else if (op.equals("/")) { System.out.println(a/b);
        }else if (op.equals("%")) { System.out.println(a%b);
        }else if (op.equals("*")) { System.out.println(a*b);
        } else { System.out.println("선택한 연산자가 적절하지 않습니다.");
        }


/*      System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a * b);*/

    }
}