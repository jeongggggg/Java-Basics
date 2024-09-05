package chap05;

public class CompareReferenceType {
    // 참조타입 비교

    public static void main(String[] args) {
        OutterClass outter = new OutterClass();
        OutterClass outter2 = new OutterClass();

        System.out.println(outter == outter2);

        String str1 = new String("문자1");
        String str2 = new String("문자1");
        System.out.println(str1 == str2); // false

        String str3 = "문자1";
        System.out.println(str1 == str3); // false

        String str4 = "문자1";
        System.out.println(str3 == str4); // true

        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equals(str3)); // true
        System.out.println(str1.equals(str4)); // true

        /*
            1,2, 3 모두 heap 메모리 영역에 특정 객체를 바라보고 있지만,
            3처럼 리터럴로 선언한다면 heap 메모리 영역에 있는 spring constant pool이라는 영역에 저장이 되기 때문에
            동등 비교를 했을 때 다른 값으로 인지한다. 만약 str4를 문자1로 다시 선언한다면 동일한 값을 갖게 된다.
            같은 값이라면 같은 값을 참조한다.
            하지만 String을 비교한다면 equals를 사용해서 주소값이 아닌 값만을 비교하도록 하는 게 좋다.
         */
    }
}
