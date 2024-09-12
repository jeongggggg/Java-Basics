package chap09;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourceSample {
    public static void main(String[] args) {
        // file 읽어오는 로직
        String filename = "example.txt";
        // AutoClosable.close();
        try(BufferedReader reader = new BufferedReader(new FileReader(filename))){
            reader.readLine();
            reader.close();
        } catch (IOException e){
            System.out.println("Error: " + e);
        }
    }
}
