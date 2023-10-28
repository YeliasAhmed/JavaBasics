package paymentSystem;

public class PaymentMethodFactory {

    public static PaymentMethod getPaymentMethod(String type){
        switch (type){
            case "Bkash":
                return new BkashPaymentMethod();

            case "Nagad":
                return new NagadPaymentMethod();

            case "Rocket":
                return new RocketPaymentMethod();

            case "Upay":
                return new UpayPaymentMethod();

            default:
                return new UnavailablePaymentMethod();
        }
    }
}
