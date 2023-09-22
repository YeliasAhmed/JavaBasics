package FactoryDesignPattern.UsingJava;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount and payment method:");
        double amount = sc.nextDouble();
        String paymentType = sc.next();
        PaymentView paymentView = new PaymentView();
        paymentView.onPaymentButtonClick(amount, paymentType);
    }
}
