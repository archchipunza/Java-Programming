import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class CalculateTax {
    public static void main(String[] args) {
        // Initialize the net price as a BigDecimal with a precision of 2 decimal places
        BigDecimal netPrice = new BigDecimal("9.99", new MathContext(2));

        // Initialize the VAT rate as a BigDecimal with a precision of 4 decimal places
        BigDecimal vatRate = new BigDecimal("0.23", new MathContext(4));

        // Calculate the gross price by adding VAT to the net price
        BigDecimal grossPrice = netPrice.add(netPrice.multiply(vatRate));
        System.out.println("Gross price: " + grossPrice);

        // Calculate the net price for 10,000 pieces by dividing the gross price by 1.23 (adding 1 to the VAT rate)
        BigDecimal netPriceFor10000 = grossPrice.divide(new BigDecimal("1.23"), new MathContext(2, RoundingMode.HALF_UP));
        System.out.println("Net price for 10,000 pieces: " + netPriceFor10000);

        // Calculate the difference between the net price for 10,000 pieces and the original net price
        BigDecimal difference = netPriceFor10000.subtract(netPrice);
        System.out.println("Difference between net price for 10,000 pieces and original net price: " + difference);
    }
}