package POO.ex14.services;

import java.time.LocalDate;

import POO.ex14.entities.Invoice;
import POO.ex14.entities.Subscription;

public class SubscriptionService {
    
    private PaymentGateway paymentGateway;

    public SubscriptionService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void processSubscription(Subscription subscription, int months) {
        for (int i = 0; i < months; i++) {
            double envoice = paymentGateway.processingFee(paymentGateway.monetaryCorrection(subscription.getValuePlan(), (i + 1)));
            LocalDate dateEnvoice = subscription.getDateStart().plusMonths(i + 1);

            subscription.getInvoices().add(new Invoice(envoice, dateEnvoice));
        }
    }
}
