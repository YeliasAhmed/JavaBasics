package FactoryDesignPattern.UsingJava;

public class UnavailablePaymentMethod extends PaymentMethod{

    @Override
    void process(double amount) {
        System.out.println("This payment method is unavailable you have entered.");
    }
}
