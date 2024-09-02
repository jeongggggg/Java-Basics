package chap02;

public class wrapper {
    public static void main(String[] args) {

        // 박싱(int -> Integer)
        int a = 10;
        Integer a2 = Integer.valueOf(a);
        Long.valueOf(10L);
        Float.valueOf(10.0f);
        Double.valueOf(3.14);

        // 오토 박싱(int -> Integer)
        Integer a3 = a;
    }
}
