package by.htp6.homework.singl;

public class SingEx2 {
private static SingEx2 instance = null;
private SingEx2(){}
public static SingEx2 getInstance(){
	if (instance == null){
		instance = new SingEx2();
	}
	return instance;
}
}
