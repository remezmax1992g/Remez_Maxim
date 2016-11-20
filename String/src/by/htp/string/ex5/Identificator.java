package by.htp.string.ex5;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Identificator {

	public static void main(String[] args) {
		System.out.println("Enter you string!");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		String regexc = "^([A-Za-z_])(\\w+)";
		Pattern pattern = Pattern.compile(regexc);
		Matcher matcher = pattern.matcher(str);
		if (matcher.matches()){
			System.out.println("It's identificator");
			
		}
		else {
			System.out.println("It isn't identificator");
		}

	}

}
