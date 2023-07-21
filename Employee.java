package demo2;

public class Employee implements Comparable<Employee> {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

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