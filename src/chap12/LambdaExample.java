package chap12;

import chap12.custom.MyFunctionalInterface;
import chap12.custom.MyFunctionalInterface2;
import chap12.custom.MyFunctionalInterface3;
import chap12.custom.MyFunctionalInterface4;

public class LambdaExample {
    public static void main(String[] args) {
        // Runnable -> 자바에서 제공해주는 인터페이스, 객체 선언
        // Runnable runnable = new 구현클래스();
        // 구현 클래스를 따로 클래스로 빼지 않고 익명으로 구현
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("익명 구현 객체의 메서드");
            }
        };  // 익명 구현 객체

        // 익명 구현 객체를 람다식으로 표현
        Runnable runnable1 = () -> System.out.println("익명 구현 객체의 메서드");

        MyFunctionalInterface inter = new MyFunctionalInterface(){
            @Override
            public void run(){
                System.out.println("Hello Lambda");
                System.out.println("Hello Lambda2");
                System.out.println("Hello Lambda3");
            }
        };
        inter.run();

        MyFunctionalInterface inter2 = () -> {
            System.out.println("Hello Lambda");
            System.out.println("Hello Lambda2");
            System.out.println("Hello Lambda3");
        };
        inter2.run();

        // 매개변수가 있는 람다식
        MyFunctionalInterface2 inter3 = (x) -> System.out.println(x);
        inter3.method(12);

        // 매개변수와 리턴 타입이 있는 람다식(매개변수 1개)
        MyFunctionalInterface3 inter4 = a -> a * 2;
        int result = inter4.method(12);
        System.out.println(result);

        // 매개변수와 리턴 타입이 있는 람다식(매개변수 2개)
        MyFunctionalInterface4 inter5 = (i, j) -> {
            System.out.println("매개변수가 2개인 method");
            return i * j;
        };
        int result2 = inter5.method(3,5);
        System.out.println("result2: " + result2);

        MyFunctionalInterface4 inter6 = (i, j) -> i + j;    // 익명 구현 객체
        int result3 = inter6.method(1,5);
    }
}
