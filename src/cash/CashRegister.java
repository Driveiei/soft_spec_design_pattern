package cash;

public class CashRegister {
	private TaxBehavior tax;
	private double purchase; // total amount of product price bought
	private double payment; // total amount of payment


	public CashRegister(TaxBehavior tax) {
		this.tax = tax;
		purchase = 0;
		payment = 0;
	}
	
	public void recordPurchase(double amount) {
		purchase += amount;
	}

	public void enterPayment(double amount) {
		payment += amount;
	}

	public void calculateTax() {
		purchase = tax.calculateTax(purchase);
	}
	
	public double giveChange() {
		double change = payment - purchase;
		purchase = 0;
		payment = 0;
		return change;
	}
}
