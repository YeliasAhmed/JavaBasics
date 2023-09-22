package FactoryDesignPattern.UsingJava;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type) {
        switch (type) {
            case "Bkash":
                return new BkashPaymentMethod();

            case "Nagad":
                return new NagadPaymentMethod();

            case "Cash":
                return new CashOnDelivery();
            default:
               return new UnavailablePaymentMethod();

        }
    }
}
