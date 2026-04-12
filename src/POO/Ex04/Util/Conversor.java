package POO.Ex04.Util;

public class Conversor {
    
    public static final double IOF = 0.06;

    public static double compraDolar(double dolar, double compra) {

        double total = compra * dolar;
        return total +  (total * IOF);
    }
}
