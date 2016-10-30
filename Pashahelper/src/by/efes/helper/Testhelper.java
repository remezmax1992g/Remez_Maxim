	package by.efes.helper;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class Testhelper {

	private static final String CYKA_BLEAT = "MAKSIM ZAEBAL";
	private static final String CYKA_DIBIL = "Oh LOL NU I TUPOI";
	
	public static void main(String[] args) throws InterruptedException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("blabla.txt")));	
		BufferedWriter write = new BufferedWriter(new OutputStreamWriter(System.out));
		char[] b = new char[1024];
		reader.read(b);
		write.write(b);
		reader.close();
		PrintStream stream = new PrintStream(System.out);
		CYKA_BLEAT.hashCode();
		CYKA_DIBIL.hashCode();
		CYKA_BLEAT.toString();
		String nuPizdec = "LAH";
		nuPizdec.hashCode();
		write.write("\n");
		write.write(new Testhelper().toString());
		write.flush();
		write.close();
	}

	@Override
	public int hashCode() {
		return 2;
	}
	
	
}
