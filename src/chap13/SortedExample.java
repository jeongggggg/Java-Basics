package chap13;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;

// 정렬
public class SortedExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("e", "a", "c", "z", "d");

        List<String> sortedList = list.stream()
                .sorted()   // 오름차순 정렬
                .toList();
        System.out.println(sortedList);

        System.out.println("=============");
        
        List<String> sortedList2 = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(sortedList2); // 내림차순 정렬
    }
}
