/**
 * Implementation of ListInterface
 */
import java.util.ArrayList;
import java.util.List;

public class ListInterface {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("A");
		list.add("C");
		list.add("E");
		list.add("E");
		list.add("E");
		
		/*Creating another List object for storing unique element*/
		List<String> uniqueList = new ArrayList<>();
		
		for(String elements : list) {
			if(!uniqueList.contains(elements)) {
				uniqueList.add(elements);
			}
		}
		System.out.println(uniqueList);
	}
}
