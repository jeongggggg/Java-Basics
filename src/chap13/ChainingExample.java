package chap13;

// 메소드 체이닝
public class ChainingExample {
    public static void main(String[] args) {
        // 메소드 체이닝 방식으로 초기화
        Pizza pizza = new Pizza(); // 디폴트 생성자 생성
        pizza.dough("치즈크러스트"); // 피자를 체이닝
        Pizza 치즈크러스트 = pizza.dough("치즈크러스트");
        치즈크러스트.source("칠리");

        Pizza 치즈크러스트2 = pizza.dough("치즈크러스트")
                                 .source("핫소스")
                                 .topping("올리브");
        pizza.dough("치즈크러스트")
             .source("핫소스")
             .topping("올리브");
    }
}

class Pizza{
    String topping;
    String source;
    String dough;

    // Pizza(String topping, String source, String dough) {}
    // setter 메소드
    // 체이닝 방식 1) 리턴 타입 통일 Pizza 2) 리턴 타입이 Pizza니까 this return
    Pizza topping(String topping){
        this.topping = topping;
        return this;
    }

    Pizza source(String source){
        this.source = source;
        return this;
    }

    Pizza dough(String dough){
        this.dough = dough;
        return this;
    }
}
