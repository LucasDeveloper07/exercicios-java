package POO.ex10.entities;

// Classe de pessoa juridica que herda a superclasse contribuintes
public class LegalEntity extends PersonTaxPayer {
    
    private Integer numberEmployees;

    public LegalEntity() {
        super();
    }

    public LegalEntity(String name, Double annualIncome, Integer numberEmployees) {
        super(name, annualIncome);
        this.numberEmployees = numberEmployees;
    }

    public Integer getNumberEmployees() {
        return numberEmployees;
    }

    public void setNumberEmployees(Integer numberEmployees) {
        this.numberEmployees = numberEmployees;
    }

    // Sobreposição do método abstrato aplicando as regras do calculo de imposto para pessoa juridica
    @Override
    public double tax() {
        double tax;

        if (numberEmployees > 10) {
            tax = getAnnualIncome() * 0.14;
        } else {
            tax = getAnnualIncome() * 0.16;
        }

        return tax;
    }
}
