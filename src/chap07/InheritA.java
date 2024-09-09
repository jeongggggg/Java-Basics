package chap07;

// 부모 클래스 : 필드와 메서드 정의
public class InheritA {
    protected int field1; // protected 접근 제어자는 같은 패키지내에서 접근이 가능하고, 상속이 가능하다.

    protected void methiod1(){ // private 접근 제어자를 사용하게 된다면 접근이 안되고 오류가 난다.
        System.out.println("InheritA.methiod1 field1:" + field1);
    }
}
