package chap02;

public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        long startTimeMs = System.currentTimeMillis();
        Integer sum = 0;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");
    }
}
