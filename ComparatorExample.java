package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorExample{

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("Bob", 25));
		personList.add(new Person("Alice", 25));
		personList.add(new Person("Charlie", 20));
		personList.add(new Person("Alice", 20));
		personList.add(new Person("Bob", 30));
		personList.add(new Person("Charlie", 20));

		//  This method is sort age in ascending order using comparable 
//		Collections.sort(personList);
//		for (Person person : personList) {
//			System.out.println(person.getName() + ": " + person.getAge());
//		}

		// This method is sort name using comparator
		Collections.sort(personList, new NameComparator());
		for (Person person : personList) {
			System.out.println(person.getName() + ": " + person.getAge());
		}
	}
	
}