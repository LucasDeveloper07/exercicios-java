package POO.ex09.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

// Subclasse de produtos usados
public class UsedProduct extends Product {
    
    // Formatação de data com DateTimeFormatter
    private final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate manufactureDate;

    public UsedProduct() {
        super();
    }

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    // Sobreposição do método priceTag() da super classe produto
    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();

        sb.append(getName() + " (Usado) - ");
        sb.append(String.format("R$%.2f", getPrice()));
        sb.append(" (Data de fabricaçao: " + fmt.format(manufactureDate) + ")");

        return sb.toString();
    }
}
