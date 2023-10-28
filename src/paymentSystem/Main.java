package paymentSystem;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter payment method: ");
        String paymentType = s.next();
        PaymentView pv = new PaymentView();
        pv.onPaymentButtonClick(paymentType);


    }
}
