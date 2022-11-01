package annotation;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {

    @Override
    @Deprecated
    void parentMethod() { }
}

    @FunctionalInterface // 함수형 인터페이스는 하나의 추상 메서드만 가능
        interface Testable {
            void test(); // 추상메서드
//            void check(); // 추상메서드
    } // 추상메서드를 딱 하나만 가지고 있어야함!

class ex12_7 {

    @SuppressWarnings ("deprecation") // 경고를 없애줌
    public static void main(String[] args) {
        Child c = new Child();
        c.parentMethod(); // deprecated 된 메서드 사용
    }
}

