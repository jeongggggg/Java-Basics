package chap13.optional;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExample2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        // NoSuchElementException 예외 발생
        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                ;
        optionalDouble.ifPresent(System.out::println); // 방법 3


        /* 빙법 2
        double result = optionalDouble.orElse(0.0);
        System.out.println(result);
         */

        /* 방법 1
        if(optionalDouble.isPresent()) {
            double avg = optionalDouble.getAsDouble();
            System.out.println(avg);
        }
        */
    }
}
