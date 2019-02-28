package cash;

public class TaxThailand implements TaxBehavior {
	@Override
	public double calculateTax(double purchase) {
        return purchase + (purchase * 0.07);		
	}

}