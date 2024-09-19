package chap10.generic;

public class BoxGenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>(); // 선언
        box.set("문자열");
        // box.set(10); // 다른 타입은 입력 불가(컴파일 오류 발생)
        String str = box.get();
        System.out.println(str);

        Box<Integer> box1 = new Box<>();
        Box<Double> box2 = new Box<>();
        Box<Boolean> box3 = new Box<>();

        // 제네릭 메서드
        Box<String> value =  Util.boxing("문자열 값"); // 매개변수의 타입이 메서드의 리턴 타입이 되기 때문에 Box<String>으로 호출되는 것이다.

         Util.boxing(56789); // 리턴 타입은? Integer
        Box<Integer> value2 = Util.boxing(56789);
        Box<Double> value3 = Util.boxing(567.8);
    }
}
