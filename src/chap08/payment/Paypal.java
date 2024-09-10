package chap08.payment;

public class Paypal implements Payment {
    private String email;

    // 생성자
    public Paypal(String email) {
        this.email = email;
    }

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount + " using email: " + email);
    }
}
