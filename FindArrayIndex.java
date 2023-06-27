/**
This program finds the index of a specific number in an array.
*/
public class FindArrayIndex {

	public static void main(String[] args) {
		int array[] = { 11, 27, 32, 40, 52, 65 };
		int index = -1;

		for (int i = 0; i < array.length; i++) {
			if(array[i] == 27) {
				/*
			 	   If a match is found, store the index and exit the loop 
				*/
				index = i;
				break;
			}
		}
		if(index != -1) {
		System.out.println("Index Number is : " + index);
		} else {
			System.out.println("Number is not found");
		} 
	}
}
