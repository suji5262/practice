package practice1;

import java.util.Scanner;

public class Practice03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        //    int num = sc.nextInt();
        String f_str = sc.nextLine();

        System.out.println("사칙연산 기호를 하나 넣으세요");
        String op = sc.nextLine(); // op = 연산

        System.out.println("두번째 숫자를 입력하세요");
        String s_str = sc.nextLine();

        // 숫자계산
        // 문자열을 > 정수로 Integer.parseInt(args[0]);
        // 문자열을 > 실수로 Integer.parseDouble(args[0]);

        int num1 = Integer.parseInt(f_str);
        int num2 = Integer.parseInt(s_str);
        int num3;

        if(op.equals("+")){
            num3 = num1 + num2;
        } else if(op.equals("-")) {
            num3 = num1 - num2;
        } else if(op.equals("*")){
            num3 = num1 * num2;
        } else if(op.equals("/")){
            num3 = num1 / num2;
        } else if(op.equals("%")){
            num3 = num1 % num2;
        } else{
            System.out.println("연산자가 유효하지 않습니다.");
        }
//        System.out.println(num1 + op + num2 + "=" + num3);

    }

}
