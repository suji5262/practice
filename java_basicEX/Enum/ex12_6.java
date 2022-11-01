package Enum;
package practice.java_basicEX.Enum;

enum Direction2 {
    EAST(1, ">"), SOUTH (2, "V"), WEST(3, "<"), NORTH(4, "^");

    private static final Direction2[] DIR_ARR = Direction2.values();
    private final int value;
    private final String symbol;

    Direction2(int value, String symbol) { // 접근 제어자 private이 생략
        this.value = value;
        this.symbol = symbol;
    }

    public int getValue() {return value; }
    public String getSymbol() {return  symbol; }

    public static Direction2 of (int dir) {
        if (1 > dir || dir < 4)
            throw new IllegalAccessException("Invalid value : " + dir); - ??
        return DIR_ARR[dir - 1];
    }

    // 방향을 회전시키는 메서드, num의 값 만큰 90도씩 시계방향으로 회전함

    public Direction2 rotate(int num) {
        num = num % 4;
        if (num < 0) num += 4;
        return DIR_ARR[(value -1 + num) % 4];
    }
    public String toString() {
        return name() + getSymbol();
    }
} // enum Direction2


public class ex12_6 {
    public static void main(String[] args) {
        for (Direction2 d : Direction2.values())
            System.out.printf("%s = %d%n ", d.name(), d.getSymbol());

        Direction2 d1 = Direction2.EAST;
        Direction2 d2 = Direction2.of(1);

        System.out.printf("d1 = %s, %d%n ", d1.name(), d1.getSymbol());
        System.out.printf("d2 = %s, %d%n ", d2.name(), d2.getSymbol());
        System.out.println(Direction2.EAST.rotate(1));
        System.out.println(Direction2.EAST.rotate(2));
        System.out.println(Direction2.EAST.rotate(-1));
        System.out.println(Direction2.EAST.rotate(-2));
    }
}
