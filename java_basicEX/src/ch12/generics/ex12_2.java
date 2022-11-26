package generics;

import java.util.ArrayList;
import java.util.Iterator;

class ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        list.add(new Student("자바왕", 1, 1));
        list.add(new Student("자바짱", 1, 2));
        list.add(new Student("홍길동", 2, 1));

        Iterator<Student> it = list.iterator();
//        Iterator it = list.iterator();
        while (it.hasNext()) {
//            Student s = (Student)it.next(); // 지네릭스를 사용하지 않으면 형변환 필요
//            Student s = it.next(); // next 반환값 > Student
//            System.out.println(s.name);

//            System.out.println(((Student)it.next()).name);
            System.out.println(it.next().name); // 윗 부분들보다 최대한 간략하게
        }
    } // main
}

class Student {
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no) {
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}
