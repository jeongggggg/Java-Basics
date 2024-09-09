package chap07;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        child.method1();
        child.method2(); // child 에 재정의한 메서드가 호출됨
        child.method3();

        // 어디까지 접근 가능할까?
        Parent parent = new Parent();
        parent.method1();
        parent.method2();
    }
}
