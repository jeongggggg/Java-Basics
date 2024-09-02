package chap02.casting;

/* 강제 타입 변환 */

public class ForceCasting {
    public static void main(String[] args) {
        // long -> int || 변형이 일어나지는 않음
        long longValue = 300;
        int intValue = (int) longValue; // int 형으로 값을 변경하고 싶다는 명시(캐스팅)를 하면 컴파일 에러가 사라짐
        String stringValue = "A";

        System.out.println("intValue = " + intValue);

        // double -> int || 변형이 일어남
        double pi = 3.14;
        int convertedInt = (int) pi;

        System.out.println("convertedInt = " + convertedInt); // 변환이 되면서 뒤에 있던 소수점 자리가 쪼개지게 된다. (3만 남음)

        // String -> char (X) (캐스팅으로 변환은 X)
        // char ver = (char) stringValue;

        // 가능하게 하려면 chatAt(index) 라는 메서드를 사용해야 한다.
        char changedValue = stringValue.charAt(0);
    }
}
