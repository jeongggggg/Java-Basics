package chap02.casting;

/* 연산식에서의 자동 타입 변환 */

public class AutoCastingInOperand {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.5;

        double result = intValue + doubleValue;    // intValue 의 값이 10.5으로 변환된다. 10.5 + 5.5 = result에 15.5가 저장

        //  int 타입으로 꼭 연산을 해야한다면 double 타입을 int 타입으로 강제 변환하고 덧셈 연산을 수행
        // int result = intValue + (int)doubleValue;
    }
}
