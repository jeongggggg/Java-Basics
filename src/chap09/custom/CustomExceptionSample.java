package chap09.custom;

public class CustomExceptionSample {
    void method() throws BalanceInsufficientException{
        // 수동으로 사용자 정의 예외 발생시키기 (만약 런타임이라면? 에러 발생하지 않음)
        throw new BalanceInsufficientException("잔고 부족 에러 메세지");
    }
}
