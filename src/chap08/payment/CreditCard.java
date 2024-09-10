package chap08.payment;

public class CreditCard implements Payment{
    private String cardNumber;

    // 초기화 될 수 있도록 생성자 선언
    public CreditCard(String cardNumber){
        this.cardNumber = cardNumber;
    }

    @Override
    public void processPayment(double amount) {
        // amount 결제 로직
        System.out.println("Processing credit card payment of $" + amount + " using card number: " + cardNumber);
    }
}
