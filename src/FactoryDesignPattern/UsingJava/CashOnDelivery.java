package FactoryDesignPattern.UsingJava;

public class CashOnDelivery extends PaymentMethod {
    @Override
     void process(double amount) {
        System.out.println("Cash on delivery method is processing");
    }
}
