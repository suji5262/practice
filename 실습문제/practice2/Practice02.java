package practice.실습문제.practice2;

import java.util.Scanner;

public class Practice02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char a = str.charAt(0);
        String result = "";

        while (true) {
            if (a == 'q') {
                break;
            }
            result = a + result;
            str = sc.next();
            a = str.charAt(0);

        }
        System.out.println(result);

    }

        }


