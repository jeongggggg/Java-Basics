package chap10.implement;

// Stogage 의 구현체
// 구현체에서도 타입 파라미터를 가져다 써야 한다.
public class StorageImpl<T> implements Storage<T> {
    private T[] array; // 필드 생성

    // 생성자
    public StorageImpl(int capacity){
        array = (T[]) new Object[capacity]; // 배열 생성
    }

    @Override
    public void add(T item, int index) {
        array[index] = item;
    }

    @Override
    public T get(int index) {
        return array[index];
    }
}
