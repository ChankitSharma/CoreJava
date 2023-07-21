import java.util.HashMap;
import java.util.Map;

/**
 * Implementation of Map Interface
 * 
 * @author Chankit
 */
public class MapInterface {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(10, "Mike");
		map.put(20, "jhone");
		map.replace(20, "Tyson");

		System.out.println(map);
		System.out.println(map.entrySet());
	}

}