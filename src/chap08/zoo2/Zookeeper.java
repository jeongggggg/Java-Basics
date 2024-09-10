package chap08.zoo2;

public class Zookeeper {
    void feed(Predator predator){ // Zoo에서 어떤
        // 타이거와 라이언 인터페이스를  매개변수로
        System.out.println("feed " + predator.getFood()); // 다형성
    }
}
