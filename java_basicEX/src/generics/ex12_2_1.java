package generics;

import java.util.*;

public class ex12_2_1 {
    public static void main(String[] args) {
//        HashMap map = new HashMap(); //JDK 1.7부터 생성자에 타입지정 생략가능
        HashMap<String, myStudent> map = new HashMap<>();
        map.put("자바왕", new myStudent("자바왕", 1, 1, 100, 100, 100));

//        public Student get(Object key) {}
        myStudent s = map.get("자바왕");

        System.out.println(map.get("자바왕").name);

    }

}


class myStudent {
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    myStudent(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}
