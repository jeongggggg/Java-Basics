package chap10.inherit;

public class ChildProduct<T, M, C> extends Product<T, M> {
    private C company;

    // 생성자
    ChildProduct(T kind, M model, C company){
        super(kind, model); // 상속 받은 것임으로 부모 호출
        this.company = company;
    }

    public C getCompany() {
        return company;
    }

}
