package chap10.quiz;
/*
    Util.getValue() 메소드는 첫 번째 매개값으로 Pair 타입과 하위 타입만 받고,
    두 번째 매개값으로 키를 받습니다.
    리턴값은 키값이 일치할 경우 Pair에 저장된 값을 리턴하고,
    일치하지 않으면 null을 리턴하도록 getValue() 제네릭 메소드를 정의해보세요.
 */

// (접근제한)<타입 파라미터> 리턴타입 메서드명(매개변수...)
public class Util {
     public static <T extends Pair<K, V>, K, V>V getValue(T pair, K key) {
        if (pair.getKey() == key){
            return pair.getValue();
        } else {
            return null;
        }
    }
}
