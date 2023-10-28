package paymentSystem;

public class RocketPaymentMethod extends PaymentMethod{
    @Override
    public void makePayment(){
        System.out.println("Rocket payment method is processing");
    }
}