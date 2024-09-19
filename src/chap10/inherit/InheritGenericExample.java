package chap10.inherit;

import java.util.ArrayList;

public class InheritGenericExample {
    public static void main(String[] args) {
        // 타입 = 클래스이기 때문에 Tv가 타입이 된다.
        // Tv tv = new Tv();
        ChildProduct<Tv, String, String> childProduct = new ChildProduct(new Tv(), "galaxy book", "samsung"); // new Tv() 생성자를 호출해서 객체를 만들어줌, 첫번째 제네릭 타입은 Tv 라는 타입이 된다.

        // ArrayList<Tv> tvList = new ArrayList<>();

        String company = childProduct.getCompany();
        System.out.println(childProduct.getCompany());
    }
}
