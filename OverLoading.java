/**
 * This program is created for performing compile time Polymorphism.
 */
public class OverLoading {
	
	void add(int a , int b) {
		int c = a + b;
		System.out.println("Addition of Integer Number : " + c);
	}
	void add(int a , Double b) {
		int x = a;
		double y = b;
		double z = x + y;
		System.out.println("Addition of Interger and Decimal Number : " + z);
	}
	public static void main(String[] args) {
		OverLoading a1 = new OverLoading();
		a1.add(10 , 20);
		a1.add(30 , 22.55);
	}
}
