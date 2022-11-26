package java_basicEX.generics;

import java.util.ArrayList;

class Product {}
class Tv2 extends Product {}
class Audio2 extends Product {}


class productTest {
    public static void main(String[] args) {
        ArrayList<Product> productList = new ArrayList<Product>();
        ArrayList<Tv2> tvList = new ArrayList<Tv2>();
//        ArrayList<Product> tvList = new ArrayList<Tv>();  //에러 - 타입이 달라 (조상-자손관계이여도!)
//        List<Tv> tvList = new ArrayList<Tv>(); // ok. 다형성 - 대입된 타입만 일치!

        productList.add(new Tv2());
        // public boolean add(Product[Tv, Audio 다 들어올수 있음] e) - Product 와 그 자손들은 ok
        productList.add(new Audio2());

        tvList.add(new Tv2());
        tvList.add(new Tv2());
//        tvList.add(new Audio());  // 에러

//        public static void printAll printAll(productList);
//        printAll(tvList); // 컴파일 에러가 발생

//        (ArrayList < Product > list);
//        {
//        printAll(tvList);  // 컴파일 에러가 발생함
//            for (Product p : list)
//                System.out.println(p);
//
//        }
    }
}
