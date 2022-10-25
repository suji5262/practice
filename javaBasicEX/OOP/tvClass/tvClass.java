package OOP.tvClass;

public class tvClass {
    public static void main(String[] args) {

        Tv t;
        //인스턴스를 참조하기 위한 변수 t 생성
        t = new Tv();
        // 인스턴스 생성
        t.channel = 7;
        t.channerlDown();
        System.out.println("현재 채널은 " + t.channel + "입니다.");

        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        t1.channel = 7;
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");
    }

    static class Tv {

        //Tv의 속성(멤버변수)
        String color;
        boolean power;
        int channel;

        //Tv의 기능(메서드)
        void power() {power = !power;}
        void channel() { ++channel; }
        void channerlDown() { -- channel; }
    }

}

//인스턴스는 참조변수를 통해서만 다룰 수 있으며, 참조변수의 타입은 인스턴스의 타입 일치
// 참조변수(Tv리모컨), 인스턴스(Tv)
