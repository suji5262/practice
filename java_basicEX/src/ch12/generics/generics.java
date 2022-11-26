package generics;

import java.util.ArrayList;

public class generics {
    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(10); // list.add(new Integer(10)); (오토박싱으로 변환)
        list.add(20);
        list.add(30); // string을 추가, 컴파일러의 한계(실행시 에러보단 나음 - 프로그램이 죽는다)
        // 실행시 에러를 컴파일 에러로 끌고 올수 있을까? - 지네릭스
        // 실행시 발생된 에러를 컴파일 통해서 잡아줌 > 에러발생활률이 낮아짐
        // 타입체크가 강화됨 - 지네릭스 덕분에

//        Integer i = (Integer)list.get(2); // 컴파일은 ok - object형으로 반환 > ClassCastException 에러 (컴파일)
        Integer i = list.get(2); // 형변환 생략가능 > Integer인걸 아닌까

        System.out.println(list);

/*
        ArrayLis list = new ArrayList();  // JDK 1.5이전에는 이렇게 썼는데 (지네릭스 도입 이전)
        ArrayList<Object> list = new ArrayList<Object>();  // JDK 1.5 이후에으 반드시 이렇게!
        list.add(10);
        list.add(20);
        list.add("30");

        String i = (String)list.get(2);
        System.out.println(list);

        > String 타입으로 넣을때는 이렇게!
*/
    }
}
