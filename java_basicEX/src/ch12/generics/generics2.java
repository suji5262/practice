package practice.java_basicEX.generics;

import java.util.ArrayList;

class Tv {};
class Audio {};

public class generics2 {
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        ArrayList<Tv> list = new ArrayList<Tv>(); // Tv 타입의 객체만 저장가능
        list.add(new Tv());
//        list.add(new Audio());

//        Tv t = (Tv)list.get(0); // list의 첫번째 요소를 꺼냄 - 타입 불일치(형변환 필요)
        Tv t = list.get(0); // list의 첫번째 요소를 꺼냄 - 타입일치(형변환 불필요)
    }
}
