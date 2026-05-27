package POO.ex12.services;

import java.time.LocalDate;

import POO.ex12.entities.Contract;
import POO.ex12.entities.Installment;

public class ContractService {
    
    private OnlinePaymentService payService;

    public ContractService(OnlinePaymentService payService) {
        this.payService = payService;
    }

    public void processContract(Contract contract, Integer months) {
        
        LocalDate installmentDate;
        double installemntValue = contract.getTotalValue() / months;
        
        for (int i = 0; i < months; i++) {
            double installmentTax = installemntValue;

            installmentTax += payService.interest(installemntValue, i + 1);
            installmentTax += payService.paymentFee(installmentTax);

            installmentDate = contract.getDate().plusMonths((i + 1));

            contract.getInstallments().add(new Installment(installmentDate, installmentTax));
        }
    }
}
