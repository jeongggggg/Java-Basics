package chap05;

public class OutterClass {
    public static void main(String[] args) {
        // ClassInstanceVariable.java 에 있는 클래스명 접근
        // 저장되는 메모리 영역이 다르기 때문에 접근 방법도 다르다.

        // 클래스 변수 접근 : 클래스명.인덱스
        System.out.println(ClassInstanceVariable.index);

        // 인스턴스 변수 접근 : 인스턴스 변수는 객체를 선언해야 접근이 가능하다.
        ClassInstanceVariable object = new ClassInstanceVariable();
        System.out.println(object.index2);
    }
}
