import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 * In thid program we are performing Age comparison
 * */
class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}

class AgeComparator implements Comparator<Person> {
	@Override
	public int compare(Person p1, Person p2) {
		return p1.getAge() - p2.getAge();
	}
}

class ComparatorExample {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Alice", 25));
		personList.add(new Person("Bob", 30));
		personList.add(new Person("Charlie", 20));

		System.out.println("Before sorting:");
		for (Person person : personList) {
			System.out.println(person.getName() + " - " + person.getAge());
		}

		Collections.sort(personList, new AgeComparator());

		System.out.println("\nAfter sorting by age:");
		for (Person person : personList) {
			System.out.println(person.getName() + " - " + person.getAge());
		}
	}
}