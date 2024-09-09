package chap07;

// 자식 클래스의 객체를 생성 후 상속된 구성요소 확인
// 각각의 메서드 호출
public class InheritanceExample {
    public static void main(String[] args) {
        InheritB inheritB = new InheritB();
        inheritB.field1 = 10;
        inheritB.methiod1(); // -> InheritA로부터 물려받은 필드와 메소드

        inheritB.field2 = 30;
        inheritB.method2();  // -> InheritB에서 추가한 필드와 메소드
    }
}
