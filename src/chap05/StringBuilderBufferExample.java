package chap05;

public class StringBuilderBufferExample {
    // StringBuffer/StringBuilder
    public static void main(String[] args) {

        String result = "";
        result += "Hello ";
        result += "Java ";
        result += "World!";
        System.out.println(result);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java ");
        buffer.append("World! ");
        System.out.println(buffer);
        System.out.println(buffer.toString());

        StringBuilder builer = new StringBuilder();
        builer.append("Hello ");
        builer.append("Java ");
        builer.append("World! ");
        System.out.println(builer);

        // insert(), substring()
        System.out.println(builer.insert(0, "첫번째"));
        // System.out.println(builer.insert(50, "오십번째다")); // 문자열 길이를 초과하면 에러
        System.out.println(builer.insert(builer.length(),"마지막에 붙히기"));

        // substring();
        String substringResult = buffer.substring(6);
        String substringResult2 = buffer.substring(6, 7);

        System.out.println(substringResult); // Java World!
        System.out.println(substringResult2); // J

        // 연속된 문자의 반복 횟수로 문자열 압축해보기
        String str = "aaaabbccd";

        for(int i = 0; i < str.length(); i++){

        }

    }
}
