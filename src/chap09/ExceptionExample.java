package chap09;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {
    public static void main(String[] args) throws IOException {
        int b = Integer.parseInt(args[0]);
        int result = 10/b; // 예외 발생 가능성이 있는 코드(예외처리 해야함) ArrayIndexOutOfBoundsException

        // (존재하는)파일에 데이터 읽어오는 코드(예외상황 가정해서 예외 처리를 해라 - 강제화)
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        reader.readLine();
        reader.close();
    }
}
