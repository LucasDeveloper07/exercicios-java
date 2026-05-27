package POO.ex13.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import POO.ex13.entities.DailyCharge;
import POO.ex13.entities.Rental;

public class RentalService {
    
    private InsuranceService insuService;

    public RentalService(InsuranceService insuranceService) {
        this.insuService = insuranceService;
    }

    public void processRental(Rental rental, LocalDate dateStart, LocalDate dateEnd) {
        int days = (int) ChronoUnit.DAYS.between(dateStart, dateEnd);
        double dailyTax;

        LocalDate billingDate = dateStart;

        for (int i = 0; i < days; i++) {
            billingDate = billingDate.plusDays(1);
            dailyTax = rental.getDailyValue() + insuService.dailyTax(rental.getDailyValue());

            rental.getDailyCharges().add(new DailyCharge(billingDate, dailyTax));
        }

        double totalRental = 0;

        for (DailyCharge dc : rental.getDailyCharges()) {
            totalRental += dc.getAmount();
        } 

        rental.setTotalRental(totalRental += insuService.admTax(totalRental));
    }
}
