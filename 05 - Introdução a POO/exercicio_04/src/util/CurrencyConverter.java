package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;
    public static double dollar;

    public static double convert(double quantity) {
        return (quantity * dollar) +  (quantity * dollar * IOF);
    }

}
