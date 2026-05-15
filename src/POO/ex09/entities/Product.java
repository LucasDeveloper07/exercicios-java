package POO.ex09.entities;

// Classe do produto (Super classe)
public class Product {
    
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Método para retornar a etiqueta de preço do produto
    public String priceTag() {
        StringBuilder sb = new StringBuilder();

        sb.append(name);
        sb.append(" - R$" + String.format("%.2f", price));

        return sb.toString();
    }
}
