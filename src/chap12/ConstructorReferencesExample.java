package chap12;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> function = Member::new;
        function.apply("string");

        BiFunction<String, String, Member> function2 = Member::new;
        function2.apply("string", "string2");
    }
}
