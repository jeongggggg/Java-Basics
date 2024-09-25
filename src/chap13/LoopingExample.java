package chap13;

import java.util.Arrays;
import java.util.List;

public class LoopingExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        
        // 짝수를 걸러내서 총 합 구하기 / 가공 단계에서 사용할 수 있는 peek 사용
        // Integer 타입이라 sum 연산을 할 수 없어서 primitive 타입으로 변환 후 sum 연산을 해야한다.
        // Stream<Integer> -> IntStream 으로 변환
        int sum = list.stream()
                .mapToInt(element -> element) // 타입 변환
                .filter(element -> element % 2 == 0)
                .peek(System.out::println)
                .sum();
        System.out.println("짝수들의 총 합 : " + sum);

        // IntStream -> Stream<Integer> primitive 타입 stream을 wrraper 타입 stream 으로 변환 시에는 boxing 메소드 사용

        // forEach 사용해서 필터링된 stream 요소 출력 / 결과 단계에서 사용
        List<Integer> list2 = Arrays.asList(1,2,3,4,5);
        list2.stream()
                .filter(element -> element % 2 == 0)
                .forEach(element -> System.out.println(element)); // = System.out::println
    }
}
