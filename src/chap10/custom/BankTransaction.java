package chap10.custom;

// '송금' 트랜잭션
public class BankTransaction {
    public static void main(String[] args){
        // A, B 계좌 생성
        Account accountA = new Account(30000);
        Account accountB = new Account(0);

        // A -> B 10만원 송금
        // 만약 잔액보다 큰 금액을 송금 시도할 경우 트랜잭션 처리
        int money = 100_000;
        try{
            accountB.deposit(money); // B걔좌 입금
            accountA.deposit(money); // A계좌 출금
        } catch (Exception e){
            // A 계좌 출금 실패했을 때, B 계좌에 입금된 금액 차감
            accountB.depositRollback(money);
            System.out.println("송금 실패");
        }
        System.out.println("송금 성공");
    }
}
