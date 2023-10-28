package paymentSystem;

public class PaymentView {

    public void onPaymentButtonClick(String paymentType){
        PaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod(paymentType);
        paymentMethod.makePayment();

    }
}
