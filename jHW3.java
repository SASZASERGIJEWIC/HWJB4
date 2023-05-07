
public class jHW3 {
    public static void main(String[] args) {
        convertEuroToDollar(75, 1.27);
    }
    static void convertEuroToDollar(double amountInEuro, double exchangeRate) {
        double amountInDollars = amountInEuro * exchangeRate;

        System.out.printf("При курсе %.2f USD за один EUR, при обмене %.2f EUR, вы получите %.2f USD",
                exchangeRate, amountInEuro, amountInDollars);
    }
}