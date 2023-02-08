import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.in;

public class practice_8393 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        br.close();
        int s = 0;

        for (int i = 0; i <= n; i++) {
            s += i;
        }

        System.out.println(s);
    }

//        Scanner sc = new Scanner(in);
//
//        int a = sc.nextInt();
//        in.close();
//        int sum = 0;
//
//        for (int i = 0; i <= a; i++) {
//            sum += 1;
//        }
//        System.out.println(sum);
//    }
}

