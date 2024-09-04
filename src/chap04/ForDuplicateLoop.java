package chap04;

public class ForDuplicateLoop {
    public static void main(String[] args) {
        // 이중 for문
        // 3번 중에 한번마다 4번씩 돌아감 그래서 총 돌아가는 횟수는 12회
        for (int i = 0; i < 3; i++) {  // i = 0, 1, 2
            for (int j = 0; j < 4; j++) {  // j = 0, 1, 2, 3
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        // 구구단
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
            System.out.println("*--------------------*");
        }
    }
}
