package chap09.custom;

public class Bank {
    public static void main(String[] args) {
        Account account = new Account(30000); // 은행 계좌 생성하는 시점의 금액, 밸런스 초기화
        account.deposit( 40000);

        // 예외 발생을 호출측에 던졌기 때문에 try-catch문으로 예외 처리를 해주어야 한다.
        try{
            account.withdraw(100000);
        }catch (BalanceInsufficientException e){
            System.out.println(e.getMessage());
        }
    }
}
