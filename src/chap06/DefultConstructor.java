package chap06;

public class DefultConstructor {
    // 디폴트 생성자
    String field;

    DefultConstructor(){

    }

    // 매개 변수 1개를 가지고 있는 생성자
    DefultConstructor(String field) {
        field = "필드 값 초기화";
    }

    public static void main(String[] args) {
        // 디폴트 생성자
        DefultConstructor constructorTest = new DefultConstructor("특정값");

        // 디폴트 생성자로 객체를 추가한다면? - 생성자 호출이 되지 않음
        // 생성자를 생성해두었기 때문에 컴파일러가 디폴트 생성자를 생성하지 않음
        // DefultConstructor constructorTest = new DefultConstructor("특정값"); 를 주석처리 후 DefultConstructor(String field){} 를 삭제하게 된다면 문제없이 생성됨
//        DefultConstructor c2 = new DefultConstructor();
    }
}
