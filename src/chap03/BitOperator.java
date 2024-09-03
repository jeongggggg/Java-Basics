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

        // 비트 쉬프트 연산자
        int value = 8;
        System.out.println(value >>> 1);
    }
}