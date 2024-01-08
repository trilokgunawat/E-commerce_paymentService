package com.example.paymentservice.paymentGateways;

import com.stripe.exception.StripeException;

public interface PaymentGateways {

    String generatePaymentLink(Long amount, String orderID) throws StripeException;
}
