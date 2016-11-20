package by.htp.string.ex3;

public class TestingSortArrayOfString {

	public static void main(String[] args) throws InterruptedException {
		ArrayOfString arr = new ArrayOfString(5);
		arr.fill();
		System.out.println("Array of unsorted String:");
		arr.print();
		arr.sort();
		System.out.println("Array of sorted String:");
		arr.print();
	

	}

}
