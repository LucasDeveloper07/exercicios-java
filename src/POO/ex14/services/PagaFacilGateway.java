package POO.ex14.services;

public class PagaFacilGateway implements PaymentGateway {
    
    private static final double FEES = 0.008;
    private static final double PROCESSING_TAX = 0.015;

    public double monetaryCorrection(double value, int months) {
        return value * Math.pow((1 + FEES), months);
    }

    public double processingFee(double value) {
        return value * (1 + PROCESSING_TAX);
    }
}
