package com.abstraction;


public class PaymentService {

    public void pay(int payment, int customerId) {
        CustomerDataService customerDataService = new CustomerDataService();

        customerDataService.getCustomerData();

        ValidatePaymentService validatePaymentService = new ValidatePaymentService();
        validatePaymentService.validate();

        DeliverProductService deliverProductService = new DeliverProductService();
        deliverProductService.deliverProduct();
    }
}
