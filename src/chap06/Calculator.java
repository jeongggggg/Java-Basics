package chap06;

public class Calculator {
    // 메서드 내에서 선언된 변수의 효력 범위
    int a;

    Calculator(){

    }

    Calculator(int a){
        this.a = a;
    }

    int postfixOperator(int a) {
        a++;
        return a;
    }

    // 객체 자체를 넘겨주는 방법
    // 전달 받는 매개변수는 Calculator 라는 객체 자체
    void postfixOperator(Calculator cal){
        cal.a++;
    } // cal의 생명주기 끝

    void postfixOperator() {
        this.a++; // a++;도 가능
    }

    public static void main(String[] args) {
        int a = 1;
        Calculator calculator = new Calculator();
        a = calculator.postfixOperator(a); // 메서드 타입 변경
        System.out.println(a); // 2출력

        // 2.Calculator cal 객체를 매개변수로 전달
        Calculator cal1 = new Calculator(1);
        cal1.postfixOperator(cal1);
        System.out.println(cal1.a); // a출력

        // 3. 최종 : cal 객체 안에 a값을 변경해주는 메서드 호출
        Calculator cal2 = new Calculator(1);
        cal2.postfixOperator();
        System.out.println(cal2.a);
    } // cal1의 생명주기 끝
}
