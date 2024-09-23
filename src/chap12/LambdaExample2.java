package chap12;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class LambdaExample2 {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "str"; // 익명 구현 객체
        String getStr = supplier.get();
        System.out.println(getStr);

        // Supplier<Integer>
        IntSupplier intsupplier = () -> 123;
        int getInt = intsupplier.getAsInt();
        System.out.println(getInt);

        Consumer<String> consumer = x -> System.out.println(x);
        consumer.accept("Consumer 사용해서 입력값 출력하기");

        // Function<Integer, String> function = x -> String.valueOf(x) + ":문자열";
        Function<Integer, String> function = x -> x + ":문자열";
        System.out.println(function.apply(123));

        Function<String, Double> function2 = x -> Double.valueOf(x) * 1.2;
        Double resultFunction = function2.apply("56.7"); // 문자열을 Double 타입으로 반환하고 1.2를 곱해줌 -> Double 타입으로 출력
        System.out.println("String to Double : " + resultFunction);
    }
}
