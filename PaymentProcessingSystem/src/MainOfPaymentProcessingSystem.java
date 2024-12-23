public class MainOfPaymentProcessingSystem {
    public static void main(String[] args) {
        // Create instances of PaymentMethod
        PaymentMethod creditCardPayment = new CreditCardPayment("1234-5678-9101-1121", "John Doe");
        PaymentMethod payPalPayment = new PayPalPayment("johndoe@example.com");

        // Process payments
        creditCardPayment.pay(500.00);
        System.out.println("Credit Card Status: " + creditCardPayment.getStatus());

        payPalPayment.pay(150.00);
        System.out.println("PayPal Status: " + payPalPayment.getStatus());

        // Process refunds
        creditCardPayment.refund(50.00);
        System.out.println("Credit Card Status: " + creditCardPayment.getStatus());

        payPalPayment.refund(20.00);
        System.out.println("PayPal Status: " + payPalPayment.getStatus());
    }
}
