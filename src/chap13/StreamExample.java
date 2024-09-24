package chap13;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) throws IOException {

        // 1. 컬렉션으로 스트림 생성
        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> stream = list.stream(); // 흐름 생성


        // 2. 배열로 스트림 생성
        String[] array = {"a", "b", "c"};
        Stream<String> stream2 = Arrays.stream(array);

        // 3. 숫자 범위로 스트림 생성
        IntStream intStream = IntStream.rangeClosed(1, 5); // [1,2,3,4,5]
        LongStream longStream = LongStream.range(1, 5); // [1,2,3,4]
        DoubleStream doubleStream = DoubleStream.of(1, 2, 3); // of : 특정 값을 입력해서 만듦 [1.0,2.0.3.0]

        // 4. 파일을 통한 스트림 생성
        Stream<String> fileStream = Files.lines(Paths.get("example.txt"), Charset.forName("UTF-8"));

        fileStream.forEach(System.out::println); // stream 안에서 제공해주는 루프 메소드 사용, 요소 각각 출력

        // 5. 스트림 연결해서 하나의 스트림 생성
        Stream<Integer> intStream1 = Stream.of(1, 2, 3);
        Stream<Integer> intStream2 = Stream.of(4, 5, 6);
        Stream<Integer> concated = Stream.concat(intStream2, intStream1);
        concated.forEach(System.out::println); // 요소 각각 출력, 4 5 6 1 2 3
    }
}
