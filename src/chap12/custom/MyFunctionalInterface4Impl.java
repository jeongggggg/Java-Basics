package chap12.custom;

// 매개변수가 2개, 리턴타입이 있는 함수형 인터페이스 -> 실제 구현은 람다식으로 구현
public class MyFunctionalInterface4Impl implements MyFunctionalInterface4{
    @Override
    public int method(int x, int y) {
        return x * y;
    }
}
