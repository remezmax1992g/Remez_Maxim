package by.htp.string.ex2;

import java.util.Scanner;

public class SumTwoString {

	public static void main(String[] args) {
		System.out.println("Enter two number");
		Scanner sc = new Scanner(System.in);
		String firstnumber = sc.nextLine();
		String secondnumber = sc.nextLine();
		sc.close();
		
		int dif = firstnumber.length() - secondnumber.length();
		
		if (dif != 0){
			if (dif < 0){
				for (int i = 0; i < Math.abs(dif); i++){
					firstnumber = 0 + firstnumber;
				}
			}
			else {
				for (int i = 0; i < dif; i++){
					secondnumber = 0 + secondnumber;
				}
			}
			
		}
		
		char[] one = firstnumber.toCharArray();
		char[] two = secondnumber.toCharArray();
		
		String sum = "";
		int dop = 0;
		for (int i = one.length - 1; i >= 0; i--){
			sum = ((int)one[i] - 48 + (int) two[i] - 48 + dop)%10 + sum;
			dop = ((int)one[i] - 48 + (int) two[i] - 48 + dop)/10;
		}
		System.out.println("result = " + sum);
	}

}
