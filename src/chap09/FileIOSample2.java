package chap09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileIOSample2 {
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        try{
            int result = 5 / b;
            System.out.println(result);
            String file = System.getProperty("user.dir");
            String filename = file + "/exam.txt";
            System.out.println(1);

            BufferedReader reader = new BufferedReader(new FileReader(filename));
            System.out.println(reader.readLine());
            reader.close();
            System.out.println(2);

        } catch (FileNotFoundException | ArithmeticException e){
            System.out.println(3);
        } catch (IOException e) {
            System.out.println(4);
        } finally{
            System.out.println(5);
        }
    }
}

