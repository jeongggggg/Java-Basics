package chap10.implement;

// 데이터를 들고 있는 저장소라고 생각
public interface Storage<T> {
    void add(T item, int index); // 값을 넣어줄 수도 있고
    
    T get(int index); // 값을 get 해줄 수도 있다.
}
