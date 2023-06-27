import java.util.Scanner;
/**
 * This Class is used for EMI calculation
 */
public class EMICalculator {

	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the principal amount: ");
	        double principal = scanner.nextDouble();

	        System.out.print("Enter the annual interest rate (%): ");
	        double interestRate = scanner.nextDouble() / 100.0;
	        double monthlyRate = interestRate / 12.0;

	        System.out.print("Enter the loan tenure (in months): ");
	        int years = scanner.nextInt();

	        double emi = calculateEMI(principal, monthlyRate, years);
	        System.out.println("The Equated Monthly Installment (EMI) is: " + emi);
	        
	        scanner.close();
	    }
	 
	    public static double calculateEMI(double principal, double monthlyRate, int years) {
	    	 return (principal * monthlyRate * Math.pow(1 + monthlyRate, years)) / (Math.pow(1 + monthlyRate, years) - 1);
	    }
	    
}
