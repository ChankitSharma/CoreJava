package Practical_15_Hybrid_Inheritance;
/**
 * Performing multilevel and multiple inheritance.
 */
public class Result extends Exam implements Project{

	@Override
	public void show() {
		System.out.println("Student Name is : " + name);
		System.out.println("Student Roll Number : " + rollNumber);
		System.out.println("Student Total Number (Thoery + Practical) : " + studentMark);
		System.out.println("Student Total Marks : " + totalMark);
	}
	
	public static void main(String[] args) {
		Result result = new Result();
		result.show();
	}

}