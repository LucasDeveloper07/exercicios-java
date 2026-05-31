package POO.ex14.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Invoice {
    
    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private Double value;
    private LocalDate dueDate;

    public Invoice(Double value, LocalDate dueDate) {
        this.value = value;
        this.dueDate = dueDate;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public String toString() {
        return "Valor: R$"
            + String.format("%.2f", value)
            + " - Vencimento: "
            + dueDate.format(fmt)
            + "\n";
    }
}
