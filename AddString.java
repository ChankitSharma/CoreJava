import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/**
 * Adding String in List using iterator
 */
public class AddString {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		
		name.add("Hello");
		name.add("world");
		name.add("$chankit");
		
		Iterator<String> iterator = name.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
	
}
