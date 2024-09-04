package chap04;

public class ForContinueExample {
    public static void main(String[] args) {
        // 0~60까지 숫자 중 3의 배수만 출력하기 (continue 사용)
        for (int i = 0; i <= 60; i++) {
            int value = i + 1;
            if (value % 3 != 0) {
                continue;
            }
            System.out.println(value + " 는 3의 배수");
        }

        System.out.println("*----------------------*");

        // 0~60까지 숫자 중 3의 배수만 출력하기 (continue 사용 X)
        for (int j = 0; j <= 60; j++) {
            int value = j + 1;
            if (value % 3 == 0) {
                System.out.println(value + " 는 3의 배수");
            }
        }
    }
}
