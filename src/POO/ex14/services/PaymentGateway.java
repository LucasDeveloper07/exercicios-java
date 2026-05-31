package POO.ex14.services;

public interface PaymentGateway {
    
    public double monetaryCorrection(double value, int months);
    public double processingFee(double value);
}
