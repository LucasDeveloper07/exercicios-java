package POO.ex13.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import POO.ex13.exceptions.DateException;

public class Rental {

    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    private Integer id;
    private Vehicle vehicle;
    private LocalDate dateStart;
    private LocalDate dateEnd;
    private Double dailyValue;
    private Double totalRental;

    private ArrayList<DailyCharge> dailyCharges = new ArrayList<>();

    public Rental(Integer id, Vehicle vehicle, LocalDate dateStart, LocalDate dateEnd, Double dailyValue) {
        this.id = id;
        this.vehicle = vehicle;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.dailyValue = dailyValue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getDateStart() {
        return dateStart;
    }

    public void setDateStart(LocalDate dateStart) {
        this.dateStart = dateStart;
    }

    public LocalDate getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(LocalDate dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Double getDailyValue() {
        return dailyValue;
    }

    public void setDailyValue(Double dailyValue) {
        this.dailyValue = dailyValue;
    }

    public Double getTotalRental() {
        return totalRental;
    }

    public void setTotalRental(Double totalRental) {
        this.totalRental = totalRental;
    }

    public ArrayList<DailyCharge> getDailyCharges() {
        return dailyCharges;
    }
    
    public String reportGenerate(int opcao) {
        if (opcao == 1) {
            StringBuilder sb = new StringBuilder();
            
            sb.append("=====RELATORIO DIARIAS=====\n");
            
            for (DailyCharge dc : dailyCharges) {
                sb.append("Diaria: " + dc.getBillingDate().format(fmt));
                sb.append(" - R$" + String.format("%.2f\n", dc.getAmount()));
            }

            return sb.toString();
        } else {
            return "Obrigado por alugar conosco!";
        }
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        
        sb.append("=====DADOS ALUGUEL=====\n");
        sb.append("ID: " + id + "\n");
        sb.append("Tipo de veiculo: ");
        sb.append(vehicle.getType() + "\n");
        sb.append("Placa: " + vehicle.getPlate() + "\n");
        sb.append("Data de retirada: " + dateStart.format(fmt) + "\n");
        sb.append("Data de devolução: " + dateEnd.format(fmt) + "\n");
        sb.append("Valor total: R$" + String.format("%.2f", totalRental));
        
        return sb.toString();
    }

    public void validateDate() {
        if (dateStart.isAfter(dateEnd)) {
            throw new DateException("Erro de data: A data de aluguel não pode ser maior que a data de devolução!");
        }
        if (dateStart.isEqual(dateEnd)) {
            throw new DateException("Erro de data: Você deve alugar o veiculo por pelo menos 1 dia!");
        }
    }
}