import java.util.Scanner;
/**
Finding the current month name using switch case. 
*/
public class MonthName {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month Number: ");
		int month = sc.nextInt();

		switch(month)
		{
			case 1:
				System.out.println("January");
				break;
			case 2:
				System.out.println("Fabruary");
				break;
			case 3:
				System.out.println("March");
				break;
			case 4:
				System.out.println("April");
				break;
			case 5:
				System.out.println("May");
				break;
			case 6:
				System.out.println("june");
				break;
			case 7:
				System.out.println("July");
				break;
			case 8:
				System.out.println("August");
				break;
			case 9:
				System.out.println("Spetember");
				break;
			case 10:
				System.out.println("Octomber");
				break;
			case 11:
				System.out.println("November");
				break;
			case 12:
				System.out.println("December");
				break;
			default:
				System.out.println("Invalid Number");
		}
		sc.close();
	}
	
}
