package paymentSystem;

public class UnavailablePaymentMethod extends PaymentMethod{
    @Override
    public void makePayment(){
        System.out.println("This payment method is unavailable at this moment");
    }
}
