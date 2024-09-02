package chap02;

public class Sample {
    public static void main(String[] args) {
        // 참조 자료형 : new 예약어를 사용하여 변수를 초기화
        // String 예외
        String str1 = "실제값";
        String str2 = new String("실제값");
        String str3 = new String("실제값");
        String str4 = new String("실제값");
        String str5 = "실제값";

        System.out.println(str2 == str3);
        System.out.println(str2 == str4);
        System.out.println(str3 == str4);
        System.out.println(str1 == str5);
        System.out.println(str1.equals(str2)); // true가 나오게 equals 메서드 사용

    }
}
