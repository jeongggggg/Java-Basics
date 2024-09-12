package chap10.generic;

public class Util {
    public static <T> Box<T> boxing(T t){ // 외부에서 호출할 수 있도록 static 사용
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
