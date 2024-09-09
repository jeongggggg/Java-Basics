package chap07;

public class DogExample {
    public static void main(String[] args) {
        Dog dog = new Dog("happy"); // 디폴트 생성자
        dog.setName("뽀삐");
        dog.sleep(); // Animal 메서드
        dog.sleep(20); // Dog에서 재정의한 메서드
    }
}
