
public class moreMath {
	//Loan term accessor multiplies the loan by 12 to account for the 
	//monthly payments
	public int getLoanTerm()
	{
		return loanTerm*12;
	}
	
	public double getTheMortgage()
	{
		return theMortgage;
	}
	
	//Interest rate accessor divides by 100 to change the int given into
	//a percentage and divides that number to account for the monthly payments
	public double getInterestRate()
	{
		return ((interestRate/100)/12);
	}
	
	//Mutators
	public void setLoanTerm(int term)
	{
		loanTerm= term;
	}
	public void setTheMortgage(double loan)
	{
		theMortgage = loan;
	}
	public void setInterestRate(double interest)
	{
		interestRate = interest;
	}
	
	//Method to calculate the monthly payments
	public double calculateMonthlyPayments()
	{
		//instantiate local variables
		double monthly;
		double dividend;
		double divisor;
		
		//assign dividend and divisor individually to help visually
		dividend = this.getInterestRate()*
				  (Math.pow((1+this.getInterestRate()),(this.getLoanTerm())));
		divisor = Math.pow((1+this.getInterestRate()),(this.getLoanTerm()))-1;
		monthly = this.getTheMortgage()*(dividend/divisor);
		return monthly;
	}	
	
	//Private members of mortgageMath class
	private int    loanTerm    ;
	private double theMortgage ;
	private double interestRate;

}
