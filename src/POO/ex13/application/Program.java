package POO.ex13.application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

import POO.ex13.entities.Rental;
import POO.ex13.entities.Vehicle;
import POO.ex13.exceptions.DateException;
import POO.ex13.services.RentalService;
import POO.ex13.services.SeguroFacilService;

public class Program {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.println("======ALUGUEL VEICULO======");
        System.out.println("Insira os dados do aluguel:");
        
        int id = random.nextInt(1000,10000);

        System.out.print("Veiculo: ");
        String typeVehicle = sc.nextLine();

        System.out.print("Placa: ");
        String plateVehicle = sc.nextLine();

        System.out.print("Data de retirada (dd/MM/yyyy): ");
        LocalDate dateStart = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Data de devolução (dd/MM/yyyy): ");
        LocalDate dateEnd = LocalDate.parse(sc.nextLine(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        System.out.print("Valor da diaria: ");
        double dailyValue = sc.nextDouble();

        Vehicle vehicle = new Vehicle(typeVehicle, plateVehicle);
        try {
            Rental rental = new Rental(id, vehicle, dateStart, dateEnd, dailyValue);
            rental.validateDate();

            RentalService rs = new RentalService(new SeguroFacilService());
            rs.processRental(rental, dateStart, dateEnd);

            System.out.println("\n" + rental);

            System.out.print("\nDeseja ver o relatório de diarias (1-Sim/2-Nao)? ");
            int opcao = sc.nextInt();
            System.out.println("\n" + rental.reportGenerate(opcao));
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
