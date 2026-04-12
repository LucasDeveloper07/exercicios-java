package POO.Ex04.Util;

public class Conversor {
    
    public static double IOF = 0.06;

    public static double compraDolar(double dolar, double compra) {

        return ((compra * dolar) + ((compra * dolar) * IOF));
    }
}
