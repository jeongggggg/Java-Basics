package chap13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// 매핑
public class MappingExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        list.stream()
                .map(element -> element.toUpperCase())
                .forEach(System.out::println);

        System.out.println("=============");

        // flatmap 2차원 -> 1차원
        Integer [][] array = {{1,2}, {3,4}};
        Arrays.stream(array)
                .flatMap(element -> Arrays.stream(element))
                .forEach(System.out::println);

        System.out.println("=============");

        // flatmap
        List<String> sentences = Arrays.asList("Hello World","Java stream");
        sentences.stream()
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .forEach(System.out::println);

        System.out.println("=============");

        // flatmap
        List<String> sentences2 = Arrays.asList("Hello World","Java stream");
        List<String> collect = sentences2.stream()
                .flatMap(element -> Arrays.stream(element.split(" ")))
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
