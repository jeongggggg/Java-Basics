package chap07;

// 상속 받은 부모 클래스에 있는 메서드를 재정의
// 메서드 오버로딩
// 리턴타입 메서드명 파라미터 개수 모두 같은데 재정의 한다면 오버라이딩
public class Dog extends Animal{
    
    // 객체 생성 순서 확인
    Dog(String name){
        // super(); 부모의 값에 아무런 값이 없는 생성자를 호출해서 빈 값의 super이 호출된다.
        System.out.println("Dog 객체 생성" + name);
    }
    
    void sleep(int times){ // 메서드를 재정의 했지만 뒤에 오는 파라미터 타입이 다르기 때문에 오버로딩(시그니처가 달라짐)
        System.out.println(name + " Zzz... " + times + " hours");
    }
}
