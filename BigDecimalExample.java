import java.math.BigDecimal;
public class BigDecimalExample {

	public static void main(String[] args) {

		BigDecimal number1 = new BigDecimal("23.3450432054062836302960935845098");
		BigDecimal number2 = new BigDecimal("20.3450432054062836302960935845098");

		// System.out.println(number1.subtract(number2));

		if (number1.compareTo(number2) == 0) {
			System.out.println(number1 + " and " + number2 + " are equal.");
		} else if (number1.compareTo(number2) == 1) {
			System.out.println(number1 + " is greater than " + number2 + ".");
		} else {
			System.out.println(number1 + " is lesser than " + number2 + ".");
		}
	}
}