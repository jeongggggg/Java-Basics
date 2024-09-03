package chap03;

public class Sample {
    public static void main(String[] args) {
        // 단항연산자 - 증감 전/후위 연산자
        int x = 5;
        int result = x--;
        System.out.println(result); // 5
        System.out.println(x); // 4

        int x1 = 14;
        int result1 = --x1;
        System.out.println(result1); // 13
        System.out.println(x1); // 13

        int x2 = 14;
        int result2 = --x2;
        System.out.println(result2); // 13
        System.out.println(x2++); // 13

        int x3 = 5;
        int result3 = x3++ + 3;
        System.out.println(result3); // 8

        int result4 = x3;
        System.out.println(result4); // 6
    }
}
