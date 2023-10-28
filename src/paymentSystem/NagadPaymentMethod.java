package paymentSystem;

public class NagadPaymentMethod extends PaymentMethod{
    @Override
    public void makePayment(){
        System.out.println("Nagad payment method is processing");
    }
}
