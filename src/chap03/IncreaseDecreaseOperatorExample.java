package chap03;

public class IncreaseDecreaseOperatorExample {
    // 전위 증감 연산자와 후위 증감 연산자
    // 후위 연산자는 다음 호출 때 적용된다고 생각
    public static void main(String[] args) {
        int x = 10;
        int y = 10;
        int z;

        System.out.println("----------------------");
        x++; // 11
        ++x;
        System.out.println("x=" + x); // 12

        System.out.println("----------------------");
        y--; // 10
        --y; // 9 -> 9 - 1
        System.out.println("y=" + y); // 8

        System.out.println("----------------------");
        z = x++; // 12
        System.out.println("z=" + z); // 12
        System.out.println("x=" + x); // 13

        System.out.println("----------------------");
        z = ++x; // 14
        System.out.println("z=" + z); // 14
        System.out.println("x=" + x); // 14

        System.out.println("----------------------");
        z = ++x + y++; // 23 = 15 + 8
        System.out.println("z=" + z); // 23
        System.out.println("x=" + x); // 15
        System.out.println("y=" + y); // 9
    }
}
