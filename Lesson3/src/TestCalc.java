
public class TestCalc {

	public static void main(String[] args) {
		double yourTax = getYourTax();
		// Printing the result
		System.out.println("Your tax is " + yourTax);
	}

	private static double getYourTax() {
		Tax tax = new Tax(); // creating an instance
		tax.grossIncome= 50000; 
		tax.dependents= 2;
		tax.state= "NJ";
		double yourTax = tax.calcTax(); //calculating tax
		return yourTax;
	}

}
