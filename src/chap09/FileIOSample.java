package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample {
    public static void main(String[] args) {
        // 파일 내용 읽어오는 코드
        int b = Integer.parseInt(args[0]);
        BufferedReader reader = null;
        try{
            int result = 5 / b; // ArithmeticException 발생 가능

            // 파일명 루트를 기준으로 확인
            String file = System.getProperty("user.dir");
            String filename = file + "/example.txt";
            System.out.println(filename);

            // 컴파일된 파일 기준으로 출력
//            String path = FileIOSample.class.getResource("").getPath();
//            System.out.println(path);

            reader = new BufferedReader(new FileReader(filename));
            System.out.println(reader.readLine());

        } catch (FileNotFoundException | ArithmeticException e){
            System.out.println("Exception: " + e);
        } catch (IOException e) {
            System.out.println("IOException 발생");
        } finally{
            try{
                reader.close();
            } catch (IOException e) {
                // reader 자원 닫으면서 예외 발생했을 때
            }
        }
    }
}
