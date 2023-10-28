package paymentSystem;

public class UpayPaymentMethod extends PaymentMethod{
    @Override
    public void makePayment(){
        System.out.println("Upay payment method is processing");
    }
}
