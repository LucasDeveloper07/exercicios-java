package POO.ex14.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Subscription {
    
    private Integer id;
    private String name;
    private LocalDate dateStart;
    private Double valuePlan;

    private ArrayList<Invoice> invoices = new ArrayList<>();

    public Subscription(String name, LocalDate dateStart, Double valuePlan) {
        Random random = new Random();

        this.id = random.nextInt(1000, 10000);
        this.name = name;
        this.dateStart = dateStart;
        this.valuePlan = valuePlan;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public Double getValuePlan() {
        return valuePlan;
    }

    public void setValuePlan(Double valuePlan) {
        this.valuePlan = valuePlan;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("======FATURAS=====\n");
        
        for (Invoice env : invoices) {
            sb.append(env);
        }

        return sb.toString();
    }
}
