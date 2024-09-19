package chap10.inherit;

// 부모 제네릭 클래스
public class Product<T, M>{
    private T kind;
    private M model;

    // 생성자
    Product(T kind, M model) {
        this.kind = kind; // 타입 추론
        this.model = model;
    }

    public T getKind() {
        return kind;
    }

    public M getModel(){
        return model;
    }
}
