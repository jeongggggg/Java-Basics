package chap04;

public class ForEachLoop {
    public static void main(String[] args) {
        String[] numbers = {"one", "two", "three", "four"};

        for (String number : numbers) { // 선언한 number 변수는 for안에서 사용할 수 있게 된다.
            System.out.println(number);
        }

        // for each문 변환

    }
}
