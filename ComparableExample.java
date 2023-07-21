import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ComparableExample {

	public static void main(String[] args) {
		List<Employee> personList = new ArrayList<>();
		personList.add(new Employee(null, 25));
		personList.add(new Employee("Alice", 25));
		personList.add(new Employee("Charlie", 20));
		personList.add(new Employee("Alice", 20));
		personList.add(new Employee("Bob", 30));
		personList.add(new Employee("Charlie", 20));

		Collections.sort(personList);
		for (Employee person : personList) {
			System.out.println(person.getName() + ": " + person.getAge());
		}
	}
	
}