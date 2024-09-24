package chap12;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> function = (x) -> new Member(x);
        // 생성자 참조
        function = Member::new;
         // 인풋으로 2개의 매개변수 값이 들어가니까 BiFunction 사용
        BiFunction<String, String, Member> function2 = (x,y) -> new Member(x,y);
        function2 = Member::new;
    }
}
