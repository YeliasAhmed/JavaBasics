package FactoryDesignPattern.UsingJava;

public class PaymentView {

    public void onPaymentButtonClick(double amount, String paymentType){
        PaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod(paymentType);
        paymentMethod.process(amount);

    }
}
