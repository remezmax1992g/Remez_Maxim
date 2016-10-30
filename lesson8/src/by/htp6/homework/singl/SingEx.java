package by.htp6.homework.singl;

public class SingEx {
	private int x;
	private String str;
	private static final SingEx instance = new SingEx();
	private SingEx(){}
	private static SingEx getInstance(){
		return instance;
	}
	
	

}