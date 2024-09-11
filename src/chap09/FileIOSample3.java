package chap09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample3 {
    public static void main(String[] args) throws IOException {
       FileIOSample3 fileIOSample3 = new FileIOSample3();
       fileIOSample3.readFile();
    }

    public void readFile() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(""));
        System.out.println(reader.readLine());
        reader.close();
    }
}
