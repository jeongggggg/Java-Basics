package chap02;

public class VariableExample {
    // long 타입
    public static void main(String[] args) {
        int a = 1;
        // int b = 10000000000; // 100억 입력 시 오류, L을 추가해도 오류가 생김, 값을 최종적으로 할당할 공간이 부족하기 때문(int로 선언됨)

        long longValue = 100; //(int -> long) 자동으로 형변환
        long longValue2 = 10000000000L; // 100억 컴파일러가 숫자만 들어있다면 기본적으로 int 형으로 생각함으로 int형이 아니라는 표시 "L"를 해주어야 한다.

        float floatValue = 1.01234F; // F는 컴파일러에 알려주기 위한 구분자이고, 출력될 때는 F를 제외한 값이 전달된다.
        double doubleValue = 1.1234;

        System.out.println(); // sout
        System.out.println("floatValue = " + floatValue); // soutv
        System.out.println("doubleValue = " + doubleValue);

        // 정밀도 테스트
        float floatValue2 = 0.1234567890123456789F;
        double doubleValue2 = 0.1234567890123456789; // 연산을 해야되고, 소수점 자리수를 보존해야 된다면 double을 사용하는 게 좋음

        System.out.println("floatValue2 = " + floatValue2);
        System.out.println("doubleValue2 = " + doubleValue2);

        // boolean 중지합니다 출력
        boolean stop = true;
        if(stop){
            System.out.println("중지합니다!");
        } else{
            System.out.println("시작합니다!");
        }
    }
}
