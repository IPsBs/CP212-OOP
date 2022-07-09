package cp212.swulab4;
/*
*	Name: Atikan Moopayak
*	Lab: 4
*	Class:	CP212 Object Oriented Programming
*	Date: 31/01/2022
*/

class Loan {

//----------------------------------
//    Data Members
//----------------------------------

    // Constant for the number of months in a year
    private final int MONTHS_IN_YEAR = 12;

    // The amount of the loan

    private double loanAmount;

    //The monthly interest rate

    private double monthlyInterestRate;

    // The number of monthly payments

    private double numberOfPayments;


//----------------------------------
//    Constructor
//----------------------------------

    //Creates a new Loan object with passed values.
    public Loan(double amount, double rate, int period) {
        setAmount(amount);
        setRate(rate);
        setPeriod(period);
    }

//-------------------------------------------------
//      Public Methods:
//
//          double  getAmount   (           )
//          double  getPeriod   (           )
//          int     getRate     (           )
//
//          double  getMontlyPayment(       )
//          double  getTotalPayment (       )
//
//          void    setAmount   ( double    )
//          void    setPeriod   ( int       )
//          void    setRate     ( double    )
//------------------------------------------------

    //Returns the loan amount.
    public double getAmount( ) {
        return loanAmount;
    }

    //Returns the loan period in the number of years.
    public int getPeriod( ) {
        return (int) (numberOfPayments / MONTHS_IN_YEAR);
    }

    //Returns the annual interest rate. rate = monthly rate * 100 * months-year
    public double getRate( ) {
        return monthlyInterestRate * 100.0 * (MONTHS_IN_YEAR);
    }
    
    //Returns the monthly payment
    public double getMonthlyPayment( ) {
        double monthlyPayment;

        monthlyPayment = loanAmount * (monthlyInterestRate / (1 - Math.pow(1 + monthlyInterestRate, - numberOfPayments)));

        return monthlyPayment;
    }
    
    //Returns the total payment
    public double getTotalPayment( ) {
        double totalPayment;

        totalPayment = getMonthlyPayment( ) * numberOfPayments;

        return totalPayment;
    }

    //Sets the loan amount of this loan.
    public void setAmount(double amount) {
        loanAmount = amount;
    }

    //Sets the interest rate of this loan.
    public void setRate(double annualRate) {
        monthlyInterestRate = annualRate/100.0/MONTHS_IN_YEAR;
    }

    //Sets the loan period of this loan.
    public void setPeriod(int periodInYears) {
        numberOfPayments = periodInYears * MONTHS_IN_YEAR;
    }
}