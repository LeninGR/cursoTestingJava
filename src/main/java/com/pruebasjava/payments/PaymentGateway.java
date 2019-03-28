package com.pruebasjava.payments;

public interface PaymentGateway {

    PaymentResponse requestPayment(PaymentRequest request);
}
