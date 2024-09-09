package chap07;

public class Student extends Person {
    int sutdentNo;

    Student(String nanme, String ssn, int sutdentNo){
        super(nanme, ssn); // 생성자를 만들어줄 때는 부모 클래스의 생성자를 호출하는 로직을 맨 위로 올려주어야 한다.
        this.sutdentNo = sutdentNo;
    }
}
