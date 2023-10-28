package paymentSystem;

public class BkashPaymentMethod extends PaymentMethod {

    @Override
    public void makePayment() {
        System.out.println("Bkash method is processing");
    }
}