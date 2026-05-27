package POO.ex13.services;

public class SeguroFacilService implements InsuranceService {
    
    private static final double DAILY_TAX_PERCENTAGE = 0.005;
    private static final double ADM_TAX_PERCENTAGE = 0.03;

    @Override
    public double dailyTax(double valueBase) {
        return valueBase * DAILY_TAX_PERCENTAGE;
    }

    @Override
    public double admTax(double totalValue) {
        return totalValue * ADM_TAX_PERCENTAGE;
    }
}
