package POO.ex10.entities;

// Classe abstrata de contribuintes
public abstract class PersonTaxPayer {
    
    private String name;
    private Double annualIncome;

    public PersonTaxPayer() {
    }

    public PersonTaxPayer(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }

    // Método abstrato para calculo do valor do imposto
    public abstract double tax(); 
}
