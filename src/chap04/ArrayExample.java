package chap04;

public class ArrayExample {
    public static void main(String[] args) {
        // String[] 문자열 배열 선언, 값 저장
        String[] arrayString = new String[10];
        arrayString[0] = "첫 번째";
        arrayString[1] = "두 번째";

        System.out.println(arrayString[2]); // 값을 할당하지 않은 값을 조회하면 null로 출력된다. (비어있음)

        // 선언, 초기화(값 저장)
        String[] arrayString2 = {"첫 번째", "두 번째"};

        System.out.println(arrayString2[0]);
        System.out.println(arrayString2[1]);
        // System.out.println(arrayString2[2]); // 배열에 존재하지 않는 인덱스로 접근하게 된다면 실행 오류가 뜨면서 강제 종료가 된다.(컴파일 오류X)

        System.out.println(arrayString2.length);
    }
}
