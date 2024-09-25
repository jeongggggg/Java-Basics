package chap13;

import java.util.Arrays;
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
    }
}
