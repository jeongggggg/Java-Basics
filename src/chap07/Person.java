package chap07;

public class Person {
    String name;
    String ssn;

    // 생성자를 호출하는 시점에 값이 할당될 수 있음
    Person(String nanme, String ssn){
        this.name = nanme;
        this.ssn = ssn;
    }
}
