package FactoryDesignPattern.UsingJava;

public class BkashPaymentMethod extends PaymentMethod {
    @Override
     void process(double amount) {
        System.out.println("Bkash payment method is processing");

    }

}
