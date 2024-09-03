package chap03;

public class BitOperator {
    public static void main(String[] args) {
        // 비트 논리 연산자
        int x = 15;
        int y = 30;

        System.out.println(x & y);
        System.out.println(x | y);
        System.out.println(x ^ y);
        System.out.println(~x);
    }
}