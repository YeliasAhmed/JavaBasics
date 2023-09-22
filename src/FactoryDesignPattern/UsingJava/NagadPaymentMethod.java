package FactoryDesignPattern.UsingJava;

public class NagadPaymentMethod extends PaymentMethod {
    @Override
     void process(double amount) {
        System.out.println("Nagad payment method is processing");
    }
}
