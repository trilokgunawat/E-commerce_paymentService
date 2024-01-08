package com.example.paymentservice.service;

import com.example.paymentservice.paymentGateways.PaymentGateways;
import com.example.paymentservice.paymentGateways.stripe.StripePaymentGateway;
import com.stripe.exception.StripeException;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private StripePaymentGateway stripePaymentGateway;

    public PaymentService(StripePaymentGateway stripePaymentGateway) {
        this.stripePaymentGateway = stripePaymentGateway;
    }

    public String createPaymentLink(Long orderId) throws StripeException {
        // payment service would make a call to orderService to fetch amount of the order

        return stripePaymentGateway.generatePaymentLink(10000L, orderId.toString());


    }
}
