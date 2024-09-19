package chap10.generic;

// 재내락 매소두 선언
// 자주 사용하는 값을 util 정적인 값으로 선언하여 사용
public class Util {
    public static final double PI = 3.14159;

    public static <T> Box<T> boxing(T t){ // 외부에서 호출할 수 있도록 static 사용
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }
}
