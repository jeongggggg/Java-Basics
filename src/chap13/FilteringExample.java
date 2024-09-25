package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// Stream 요소 필터링
public class FilteringExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a","b","b","c","c","a");
        list.stream()
                .distinct()
                .forEach(System.out::print);

        System.out.println("\n=============");

        List<String> sentences = Arrays.asList("김밥", "김밥", "김치", "나비", "나방");
        sentences.stream()
                .filter(str -> str.startsWith("김")) // 구현체가 true 일 경우에만 출력 (앞글자가 김일 경우에만)
                .distinct() // 중복 제거
                .forEach(System.out::println);

        System.out.println("=============");

        Set<String> set = sentences.stream()
                        .filter(x -> x.startsWith("김"))
                        .collect(Collectors.toSet());
        System.out.println(set);

        System.out.println("=============");

        String[] dupArray = {"김밥", "김밥", "김치", "나비", "나방"};
        Set<String> hashSet = Arrays.stream(dupArray).collect(Collectors.toSet());
        List<String> arrayList = Arrays.stream(dupArray).distinct().toList();
        System.out.println(hashSet);
        System.out.println(arrayList);
    }
}
