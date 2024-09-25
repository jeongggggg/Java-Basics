package chap13;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class quiz {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        List<Integer> result = numbers.stream()
                .map(x -> x * x)
                .collect(Collectors.toList());
        System.out.println(result);

        System.out.println("=============");

        List<String> sentences = Arrays.asList("Hello:world","Java:stream:flatMap","Functional:programming");
        List<String> collect = sentences.stream()
                .flatMap(x -> Arrays.stream(x.split(":")))
                .collect(Collectors.toList());
        System.out.println(collect);

        System.out.println("=============");

        List<List<Integer>> numbers2 = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5, 6),
                Arrays.asList(7, 8, 9)
        );
        List<Integer> result2 =
                numbers2.stream()
                .flatMap(x -> x.stream())
                .toList();
        System.out.println(result2);

        System.out.println("=============");

        class Person{
            String name;
            int age;

            Person(String name, int age){
                this.name = name;
                this.age = age;
            }
        }

        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Bob", 25),
                new Person("Charlie", 28)
        );

         List<String> peopleList = people.stream()
                 .filter(person -> person.age >= 28)
                 .map(person -> person.name)
                 .toList();
        System.out.println(peopleList);

        System.out.println("=============");

        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> wordsResult = words.stream()
                .filter(x -> x.length() <= 5)
                .toList();
        System.out.println(wordsResult);

        System.out.println("=============");

        List<String> words2 = Arrays.asList("hello", "world", "java");

        List<String> result3 = words2.stream()
                .map(x -> x.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(result3);

        System.out.println("=============");

        List<String> words3 = Arrays.asList("apple", "banana", "cat", "dog", "elephant");

        List<String> result4 = words3.stream()
                .filter(x -> x.length() >= 5)
                .toList();

        System.out.println(result4);

        System.out.println("=============");

        List<Integer> numbers3 = Arrays.asList(5, 12, 25, 37, 48, 50, 63);

        List<Integer> result5 = numbers3.stream()
                .filter(x -> 50 > x && x > 10)
                .toList();
        System.out.println(result5);

        System.out.println("=============");

        List<String> sentences2 = Arrays.asList("I like apples", "Bananas are tasty", "apple pie is delicious", "I have an apple");

        List<String> result6 = sentences2.stream()
                .filter(x -> x.contains("apple"))
                .toList();
        System.out.println(result6);

    }
}
