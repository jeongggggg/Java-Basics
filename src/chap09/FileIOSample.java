package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample {
    public static void main(String[] args) {
        // 파일 내용 읽어오는 코드
        int b = Integer.parseInt(args[0]);
        try{
            int result = 5 / b; // ArithmeticException 발생 가능

            // 파일명 루트를 기준으로 확인
            String file = System.getProperty("user.dir");
            String filename = file + "/example.txt";
            System.out.println(filename);

            // 컴파일된 파일 기준으로 출력
//            String path = FileIOSample.class.getResource("").getPath();
//            System.out.println(path);

            BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println(reader.readLine());
            reader.close(); // 파일 입출력 관련된 클래스의 객체를 생성했을 때 자원을 닫아주어야 메모리 누수가 없음
        } catch (FileNotFoundException | ArithmeticException e){
            System.out.println("Exception: " + e);
        } catch (IOException e) {
            System.out.println("IOException 발생");
        }
    }
}
