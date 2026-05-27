package POO.ex12.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import POO.ex12.entities.Contract;
import POO.ex12.services.ContractService;
import POO.ex12.services.PaypalService;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do contrato:");
        System.out.print("Numero: ");
        int IdContract = sc.nextInt();
        sc.nextLine();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate contractDate = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Valor do contrato: ");
        double valueContract = sc.nextDouble();

        Contract contract = new Contract(IdContract, contractDate, valueContract);

        System.out.print("Digite o numero de parcelas desejado: ");
        int instContract = sc.nextInt();

        ContractService cs = new ContractService(new PaypalService());

        cs.processContract(contract, instContract);

        System.out.println("\nParcelas:");
        System.out.println(contract);

        sc.close();
    }
}
