package chap12;

import java.util.function.ToIntBiFunction;

public class MethodParameterReferencesExample {
    public static void main(String[] args) {
        ToIntBiFunction<String, String> function;

        function = String::compareToIgnoreCase;
        print(function.applyAsInt("a","A"));
    }

    static void print(int order){
        if(order < 0){
            System.out.println("사전순으로 먼저 옵니다.");
        } else if(order == 0){
            System.out.println("동일한 문자열입니다.");
        } else{
            System.out.println("사전순으로 나중에 옵니다.");
        }
    }
}
