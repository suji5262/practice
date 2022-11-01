package practice.java_basicEX.Enum;

public class EX1 {
}
class Card {
    static final int CLOVER = 0;
    static final int HEART = 1;
    static final int DIAMOND = 2;
    static final int SPADE = 3;

    static final int TWO = 0;
    static final int THREE = 1;
    static final int  FOUR = 2;

    final int kind;
    final int num;
}

class Card2 {//     0,   1,      2,        3
    enum Kind2 { CLOVER, HEART, DIAMOND, SPADE } // 열거형 kind를 정의
    enum Value2 {TWO, THREE, FOUR } // 열거형 value를 정의

    final Kind2 kind2; // 타입이 int가 아닌 kind임에 유의해라
    final Value2 value2;

}

