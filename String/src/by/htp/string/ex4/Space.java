package by.htp.string.ex4;

import java.util.Scanner;

public class Space {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String");
		String str = sc.nextLine();
		sc.close();
		String str1 = str.trim();
		System.out.println(str1);
		String str2 = str1.replaceAll("\\s+", "*");
		System.out.println(str2);
	}

}
