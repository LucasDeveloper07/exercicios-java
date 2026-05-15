package POO.Ex08.entities;

// Classe do funcionário terceirizado da empresa, ela herda a classe funcionário comum
public class OutsourcedEmployee extends Employee {

    private Double additionalCharge; // Atributo de custo adicional para funcionários terceirizados
    
    public OutsourcedEmployee() {
        super();
    }

    // Construtor para instância dos objetos com atributos iniciados utilizando o método super()
    public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    /* Sobreposição do método payment() da classe funcionário comum,
    adicionando o bônus referente ao custo adicional */
    @Override
    public final double payment() {
        return super.payment() + (additionalCharge * 1.10);
    }
}
