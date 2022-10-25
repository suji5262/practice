package OOP.variable;

public class cardClass {

    public static void main(String[] args) {

        System.out.println("Card.width = " + OOP.variable.Card.width);
        System.out.println("Card.height = " + OOP.variable.Card.height);

        OOP.variable.Card c1 = new OOP.variable.Card();
        c1.kind ="Heart";
        c1.number = 7;

        OOP.variable.Card c2 = new OOP.variable.Card();
        c2.kind ="spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind +", " + c1.number + "이며, 크기는 (" +c1.width +
                "," + c1.height + ")");
        System.out.println("c2은 " + c2.kind +", " + c2.number + "이며, 크기는 (" +c2.width +
                "," + c2.height + ")");

        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind +", " + c1.number + "이며, 크기는 (" +c1.width +
                "," + c1.height + ")");
        System.out.println("c2은 " + c2.kind +", " + c2.number + "이며, 크기는 (" +c2.width +
                "," + c2.height + ")");

    }
}

class Card {

    String kind;
    int number;
    static int width = 100;
    static int height = 250;
    // static - cv => 공통분모
    //위에 c1만 값을 바꿨는데 c2도 바뀐 이유? - width, height 가 공통분모라!

}

