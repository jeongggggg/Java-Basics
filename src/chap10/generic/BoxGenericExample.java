package chap10.generic;

public class BoxGenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>(); // 선언
        box.set("문자열");
        // box.set(10); // 다른 타입은 입력 불가(컴파일 오류 발생)
        String str = box.get();
        System.out.println(str);
    }
}
