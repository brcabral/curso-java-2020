package entities;

public class CurrencyConverter {
	public static final double IOF = 1.06;

	public static double converter(double dollar, double dollarsBought) {
		return (dollar * dollarsBought) * IOF;
	}
}
