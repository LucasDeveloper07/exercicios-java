package POO.ex13.entities;

import java.time.LocalDate;

public class DailyCharge {
    
    private LocalDate billingDate;
    private Double amount;

    public DailyCharge(LocalDate billingDate, Double amount) {
        this.billingDate = billingDate;
        this.amount = amount;
    } 

    public LocalDate getBillingDate() {
        return billingDate;
    }

    public void setBillingDate(LocalDate billingDate) {
        this.billingDate = billingDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}