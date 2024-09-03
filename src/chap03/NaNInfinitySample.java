package chap03;

public class NaNInfinitySample {
    public static void main(String[] args) {
        // NaN, Infinity
        double a = 10;
        double b=  0;

        System.out.println(a / b); // Infinity
        System.out.println(a % b); // NaN

        // NaN, Infinity를 체크
        System.out.println(Double.isInfinite(a / b));  // true, is ~ : 결과가 boolean
        System.out.println(Double.isNaN(a % b));  // true, b에 0이 아닌 값이 들어가면 false로 출력
    }
}
