package cash;


public class TaxCA implements TaxBehavior {
	
	@Override
	public double calculateTax(double purchase) {
        return purchase + (purchase * 0.075);		
	}

}