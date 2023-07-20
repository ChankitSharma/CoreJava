/**
 * The Encapsulation class demonstrates encapsulation by encapsulating employee
 * information such as ID and name.
 * 
 * @author Chankit
 */
public class Encapsulation {

	private int employee_id;
	private String name;

	public void setEmployeeId(int x) {
		employee_id = x;
	}

	public int getEmployeeId() {
		return employee_id;
	}

	public void setEmployeeName(String y) {
		name = y;
	}

	public String getEmployeeName() {
		return name;
	}

}