import java.math.BigDecimal;
public class TaxCalculationIkeh {

    public static void main(String[] args) {


        double netPrice = 9.99;
        double vatRate = 0.23;

        double grossPrice = netPrice * (1 + vatRate);
        System.out.println("Gross price using double: " + grossPrice);

        double totalGross = grossPrice * 10000;
        System.out.println("Total gross for 10,000 items using double: " + totalGross);

        double totalNet = totalGross / (1 + vatRate);
        System.out.println("Total net calculated from gross using double: " + totalNet);

        System.out.println("----------------------------------");


        BigDecimal net = new BigDecimal("9.99");
        BigDecimal vat = new BigDecimal("0.23");
        BigDecimal one = new BigDecimal("1");

        BigDecimal gross = net.multiply(one.add(vat));
        System.out.println("Gross price using BigDecimal: " + gross);

        BigDecimal totalGrossBD = gross.multiply(new BigDecimal("10000"));
        System.out.println("Total gross for 10,000 items using BigDecimal: " + totalGrossBD);

        BigDecimal totalNetBD = totalGrossBD.divide(one.add(vat), 2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Total net calculated from gross using BigDecimal: " + totalNetBD);

        System.out.println("----------------------------------");

        System.out.println("Conclusion: BigDecimal provides more precise results for financial calculations than double.");
    }
}