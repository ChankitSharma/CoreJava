import java.util.HashSet;
import java.util.Set;

/**
 *  Implementation of Set Interface
 *  
 *  @author Chankit
 */
public class SetInterface {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		set.add(100);
		set.add(200);
		set.add(300);

		System.out.println("Does the Set contains 300 :" + set.contains(300));
		System.out.println("Set interface added elements :" + set);
	}

}