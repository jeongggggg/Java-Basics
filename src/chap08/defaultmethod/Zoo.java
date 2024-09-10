package chap08.defaultmethod;

public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookepper = new Zookeeper();

        Lion lion = new Lion();
//        Predator lion = new Lion(); 인터페이스의 형태로도 받아줄 수 있다.
        zookepper.feed(lion);

        Tiger tiger = new Tiger();
//        Predator tiger = new Tiger(); 인터페이스의 형태로도 받아줄 수 있다.
        zookepper.feed(tiger);
    }
}
