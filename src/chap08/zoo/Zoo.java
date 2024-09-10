package chap08.zoo;

/**
 *인터페이스를 사용하지 않고
 * 사육사가 각 동물마다 먹이를 주는
 * zookeeper.feed() 메서드 호출
*/
public class Zoo {
    public static void main(String[] args) {
        Zookeeper zookepper = new Zookeeper();

        Lion lion = new Lion();
        zookepper.feed(lion);

        Tiger tiger = new Tiger();
        zookepper.feed(tiger);
    }
}
