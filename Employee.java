/**
 * Program to demonstrate comparable interface.
 * 
 * @author Chankit
 */
public class Employee implements Comparable<Employee> {

	private String name;
	private int age;

	/**
	 * This is the parameterize constructor for set name and age
	 */
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/**
	 * This method is used for getting the Name
	 */
	public String getName() {
		return name;
	}

	/**
	 * This method is used for gatting the age
	 */
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Employee other) {
		if (this.name == null && other.name == null) {
			return 0;
		} else if (this.name == null) {
			return 1;
		} else if (other.name == null) {
			return -1;
		} else {

			int nameComparison = this.name.compareTo(other.name);
			if (nameComparison == 0) {
				return Integer.compare(this.age, other.age);
			}
			return nameComparison;
		}
	}

}