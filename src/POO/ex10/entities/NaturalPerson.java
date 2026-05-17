package POO.ex10.entities;

// Classe de pessoa fisica que herda a classe contribuinte
public class NaturalPerson extends PersonTaxPayer {
    
    private Double expenseHealth;

    public NaturalPerson() {
        super();
    }

    public NaturalPerson(String name, Double annualIncome, Double expenseHealth) {
        super(name, annualIncome);
        this.expenseHealth = expenseHealth;
    }

    public Double getExpenseHealth() {
        return expenseHealth;
    }

    public void setExpenseHealth(Double expenseHealth) {
        this.expenseHealth = expenseHealth;
    }

    // Sobreposição do método abstrato aplicando as regras do calculo de imposto para pessoa fisica
    @Override
    public double tax() {
        double tax;

        if (getAnnualIncome() < 20000.00) {
            tax = getAnnualIncome() * 0.15;
        } else {
            tax = getAnnualIncome() * 0.25;
        }

        if (expenseHealth != null && expenseHealth != 0) {
            tax -= expenseHealth * 0.50;
        }

        return tax;
    }
}
