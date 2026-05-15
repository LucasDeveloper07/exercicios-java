package POO.ex09.entities;

// Subclasse de produtos importados
public class ImportedProduct extends Product {
    
    private Double customsFee; // Taxa de importação

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    // Método para retornar o valor total do produto somado com a taxa de importação
    public double totalPrice() {
        return getPrice() + customsFee;
    }

    // Sobreposição do método priceTag() da super classe produto
    @Override
    public String priceTag() {
        StringBuilder sb = new StringBuilder();

        sb.append(getName());
        sb.append(" - R$" + String.format("%.2f", totalPrice()));
        sb.append(" (Custo da alfandega: R$" + String.format("%.2f", customsFee) + ")");

        return sb.toString();
    }
}
