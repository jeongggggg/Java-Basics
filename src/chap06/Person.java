package chap06;

// final 필드
public class Person {
    // final String nation = "Korea"; // 필드 선언시 초기화
    final String nation; // 생성자안에서 초기화
    String name;

    Person(String name){
        this.nation = "Korea"; // 생성자안에서 초기화
        this.name = name;
    }

    public static void main(String[] args) {

    }
}
