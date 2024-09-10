package chap08.defaultmethod;

// 디폴트 메서드
public interface Predator {
    String getFood();

    default void printFood(){
        System.out.printf("my food is %s\n", getFood());
    }
}
