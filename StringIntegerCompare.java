public class Demo {

	public static void main(String[] args) {
		String nameOne = "chankit";
		String nameTwo = "chankit";
		String nameThree = new String("chankit");
		Integer digitOne = 10;
		Integer digitTwo = new Integer(10);

		System.out.println(digitTwo == digitOne);
		System.out.println(digitOne.equals(digitTwo));
		System.out.println(nameOne == nameTwo);
		System.out.println(nameOne.equals(nameTwo));
		System.out.println(nameOne == nameThree);
		System.out.println(nameOne.equals(nameThree));
	}

}