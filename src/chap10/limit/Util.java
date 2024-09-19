package chap10.limit;

public class Util {
    // -1, 0, 1
    public static <T extends Number> int compare(T t1, T t2){
        // 실수형
        double value1 = t1.doubleValue(); // 매개변수로 입력받은 t1을 double 타입으로 변환해준 것. compare을 사용하기 위해
        double value2 = t2.doubleValue();

        return Double.compare(value1, value2);
    }
}
