public class Child extends OverRiding {

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
