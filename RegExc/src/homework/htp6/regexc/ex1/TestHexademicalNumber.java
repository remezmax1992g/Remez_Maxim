package homework.htp6.regexc.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestHexademicalNumber {

	public static void main(String[] args) throws IOException {
		HexademicalNumber h = new HexademicalNumber();
		String regexc = h.getRegexc();
		System.out.println("enter text");
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String text = r.readLine();
		Pattern p = Pattern.compile(regexc);
		Matcher m = p.matcher(text);
		
		while (m.find()){
			h.set(m.group());
		}
		
		List<String> list = h.getListHexNumber();
		h.print(list);

	}

}
