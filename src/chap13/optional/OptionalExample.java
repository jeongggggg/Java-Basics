package chap13.optional;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> list = null;
        // list.stream().forEach(System.out::println); // NullPointerException

        // Optional
        Optional<List<String>> optional = Optional.ofNullable(list);
        // optional.orElseGet(() -> Collections.emptyList()); // 값 꺼내오기
        optional.orElseGet(Collections::emptyList)
                .forEach(System.out::println);

        // Optional 객체 생성 empty(), of(), ofNullable()
        Optional<Integer> empty = Optional.empty();
        OptionalInt empty2 = OptionalInt.empty();
        OptionalDouble empty3 = OptionalDouble.empty();

        Optional<Integer> optional2 = Optional.of(10);

        Optional<Integer> optional3 = Optional.ofNullable(3456);

        // Optional 객체 꺼내기 get(), orElse(), orElseGet(), orElseThrow()
        Integer value = empty.orElse(123); // value 123
        // empty2.orElseGet(() -> 12);

        Integer i = optional2.orElseThrow(NoSuchElementException::new);
        System.out.println(i);

        // isPresent()
        if (optional.isPresent()) {
            Integer integer = optional3.get();
            System.out.println(integer);
        }
    }
}
