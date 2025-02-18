package com.example.utility.patterns.bahavioral.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Using Credit Card
        context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.payAmount(100);

        // Using PayPal
        context.setPaymentStrategy(new PayPalPayment("user@example.com"));
        context.payAmount(200);

        // Using Bitcoin
        context.setPaymentStrategy(new BitcoinPayment("3FZbgi29cpjq2GjdwV8eyHuJJnkLtktZc5"));
        context.payAmount(500);
    }
}