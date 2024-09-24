package chap13.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        List<String> list = null;
        list.stream().forEach(System.out::println); // NullPointerException

        // Optional
        Optional<List<String>> optional = Optional.ofNullable(list);
        // optional.orElseGet(() -> Collections.emptyList()); // 값 꺼내오기
        optional.orElseGet(Collections::emptyList)
                .forEach(System.out::println);
    }
}
