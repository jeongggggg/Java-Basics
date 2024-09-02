package chap02.casting;

 /* 자동 타입 변환 */

public class AutoCasting {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;        // 타입 변환 (byte -> int)
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;               // char 타입에서 int 타입으로 변환하면 유니코드가 된다.
        System.out.println("'가'의 유니코드= " + intValue);

        intValue = 500;                    //  500으로 초기화
        long longValue = intValue;        // 타입 변환 (int -> long)
        System.out.println(longValue);

        intValue = 200;                    // int 에 200 이라는 정수형값을 넣고 실수형(double) 값으로 변환
        double doubleValue = intValue;    // 타입 변환 (int -> double), 타입이 변환되면서 더 큰 숫자로 변환된다.(200.0)
        System.out.println(doubleValue);
    }
}
