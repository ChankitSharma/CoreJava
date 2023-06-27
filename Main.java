/**
 * This is the Main class for the Encapsulation
 * */
public class Main {

	public static void main(String[] args) {
		
		Encapsulation employee = new Encapsulation();
		
		employee.setEmployeeId(10);
		employee.setEmployeeName("Chankit");
		System.out.println(employee.getEmployeeId());
		System.out.println(employee.getEmployeeName());
	}
	
}