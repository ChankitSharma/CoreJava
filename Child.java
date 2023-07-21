/**
 * Program to demonstrate polymorphism. In this program we are performing overriding and Overloading
 *
 * @author Chankit
 */
public class Child extends OverRiding {

	/**
	 * This is the show method for impelmenting user's details
	 */
	void show() {
		String name = "Chankit";
		String city = "Rajasthan";
		System.out.println("Name : " + name);
		System.out.println("City : " + city);
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.show();
	}

}