package chap10.quiz;

public class Util {
    public static <K, V> V getValue(Pair<? extends K, V> pair, K key) {
        if (pair.getKey().equals(key)) {
            return pair.getValue();
        } else {
            return null;
        }
    }
}
