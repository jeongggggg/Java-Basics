package chap09.custom;

// 은행계좌 클래스
public class Account {
    long balance; // 잔금
    
    // 생성자가 호출되는 시점에 초기화
    Account(long balance){
        this.balance = balance;
    }
    
    void deposit(long money){
        this.balance += money;
    }
    
    void withdraw(long money) throws BalanceInsufficientException{
        // 잔액보다 큰 금액이 들어왔을 경우 예외 던져줌, 출금 가능할 때는 출금
        if(balance < money){ // 출금 불가
            // 출금이 불가능한 상황에서 예외 수동으로 발생
            // new 키워드를 사용해서 메세지를 설정하고 있음
            throw new BalanceInsufficientException("잔액이 부족합니다. 남은금액 : " + balance);
        }
        balance -= money; // 잔액 차감
    }
}
