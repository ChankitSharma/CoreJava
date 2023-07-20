/**
 * Extending parent class and calling variable using this and super keyword.
 *
 * @author Chankit
 */
public class SuperKeyword extends Parent {

	int value = 20;

	void show(int value) {
		System.out.println(this.value);
		System.out.println(super.value);
	}

	public static void main(String[] args) {

		SuperKeyword superKey = new SuperKeyword();
		superKey.show(30);
	}

}