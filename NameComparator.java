import java.util.Comparator;

public class NameComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		int nameComparison = o1.getName().compareTo(o2.getName());
		if (nameComparison == 0) {
		return Integer.compare(o1.getAge(), o2.getAge());
		}
		return nameComparison;
	}

}