package chap05;

public class StringFormat {

    // 문자열 포맷(%s, %d, %f)
    public static void main(String[] args) {
        String str = "..........%s......특정문자%s값";
        System.out.println(String.format(str,"치환값1", "치환값2"));

        System.out.println(String.format(str, 4, 5));

        String str2 = "치환값 : %d ...........치환값2 : %d";
        System.out.println(String.format(str2, 7, 8));

        String str3 = "치환값1 : %f ...... 치환값2 : %f";
        // System.out.println(String.format(str3, "문자", "문자2?")); 에러
        System.out.println(String.format(str3, 1.1, 2.2));
    }
}
