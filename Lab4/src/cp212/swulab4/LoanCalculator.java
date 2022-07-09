package cp212.swulab4;
/*
*	Name: Atikan Moopayak
*	Lab: 4
*	Class:	CP212 Object Oriented Programming
*	Date: 31/01/2022
*/
import java.text.DecimalFormat;
import java.util.*;

 class LoanCalculator {

// ----------------------------------
//     Data Members
// ----------------------------------

      // This object does the actual loan computation
     private Loan loan;
     private static enum Response{YES, NO}
     Scanner scanner;
// ----------------------------------
 //
//   Main Method
 //
// ----------------------------------

     public static void main(String[] arg) {
         
         LoanCalculator calculator = new LoanCalculator();
         calculator.start();
     }


// -------------------------------------------------
//       Public Methods:
 //
//           void start (        )
 //
// ------------------------------------------------

     //Top-level method that calls other private methods
     public void start() {
    	 Response response;

         describeProgram();   //tell what the program does
         response = prompt("Do you want to proceed the loan calculation?");
         while(response == Response.YES) {
         getInput();   //get three input values
         displayOutput();    //display the results
         response = prompt("Do you want to proceed the loan calculation?");
     }
     }
     private Response prompt(String question) {
    	 String input;
    	 Response response = Response.NO;
    		 System.out.print(question+ "(Yes - y;No - n):");
    		 scanner = new Scanner(System.in);
    		 input = scanner.next();
    		 if (input.equals("Y") ||input.equals("y")) {
    			 response = Response.YES;
    		 }
    		 return response;
    	 }
     

// -------------------------------------------------
//       Private Methods:
 //
//       void    describeProgram   (        )
//       void    displayOutput     (        )
//       void    getInputs         (        )
 //
// ------------------------------------------------


     // Provides a brief explanation of the program to the user.
     private void describeProgram() {
         System.out.println("This program computs the monthly and total");
         System.out.println("payment for agiven loan amount, annual");
         System.out.println("interest rate, and loan period(# of years)");
         System.out.println("\n");
     }


     //Displays the input values and monthly and total payments.
     private void displayOutput() {
         
         DecimalFormat df = new DecimalFormat("0.00");
         
         System.out.println();
         System.out.println("Loan Amount:\t\t$" + loan.getAmount());
         System.out.println("Annual Interest Rate:\t"
                             + loan.getRate() + "%");
         System.out.println("Loan Period (years):\t" + loan.getPeriod());

         System.out.println("Monthly payment is \t$" + 
                                        df.format(loan.getMonthlyPayment()));
         System.out.println("  TOTAL payment is \t$" + 
                                        df.format(loan.getTotalPayment()));
     }


     // Gets three input values--loan amount, interest rate, and
     // loan period
     private void getInput() {
         double  loanAmount, annualInterestRate;

         int     loanPeriod;
         
         Scanner scanner = new Scanner(System.in);;

         System.out.print("Loan Amount (Dollars+Cents):");
         loanAmount  = scanner.nextDouble();

         System.out.print("Annual Interest Rate (e.g., 9.5):");
         annualInterestRate = scanner.nextDouble();

         System.out.print("Loan Period - # of years:");
         loanPeriod  = scanner.nextInt();

         //create a new loan with the input values
         loan = new Loan(loanAmount, annualInterestRate, loanPeriod);
     }

 }