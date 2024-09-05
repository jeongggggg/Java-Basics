package chap05;

public class StringInnerMethod {
    // 문자열 내장 메서드 실습
    public static void main(String[] args) {
        // indexOf / "Hello Java" J의 위치 출력
        String hello = "Hello JAVA";
        System.out.println(hello.indexOf("J")); // 6

        // charAt / 위치 찾은 것을 문자로 출력
        System.out.println(hello.charAt(hello.indexOf("J"))); // J

        // replace()
        String hello2 = "Hello Java Java";
        String replaceStr =  hello2.replaceAll("Java","everyone");
        System.out.println(replaceStr); // Hello everyone everyone

        // substring
        String hello3 = "Hello everyone everyone";
        System.out.println(hello3.substring(8, 13)); // eryon
        System.out.println(hello3.substring(13)); // e everyone

        // toUpperCase, toLowerCase()
        String hello4 = "Hello World";
        System.out.println(hello4.toUpperCase());
        System.out.println(hello4.toLowerCase());

        //trim
        System.out.println("     hello4.trim(): ".trim());
        
        // "aaaaddccd" 문자열 한 글자씩 출력하기
        String str = "aaaabbccd";
        for(int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
        }

        // 단어 순서 뒤집기
        String str2 = "Hello Welcom Java";
        String[] arr = str2.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("-------------");

        // 공백 제외해서 하나의 문자로 출력
        String str3 = "    Hello Welcome Java   ";
        System.out.println(str3.replace(" ",""));
    }

}
