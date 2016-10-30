package homework.htp6.regexc.ex1;

import java.util.ArrayList;
import java.util.List;

public class HexademicalNumber {
	
	private final static String regexc = "0[xX](([\\da-f]+)|([\\dA-F]+))";
	private  List<String> listHexNumber;
	
	public HexademicalNumber(){
		this.listHexNumber = new ArrayList<String>();
	}
	
	public static String getRegexc(){
		
	return regexc;
	
	}
	
	public void set(String element){
		
		listHexNumber.add(element);
		
	}
	
	public List<String> getListHexNumber(){
		
		return listHexNumber;
	}
	
	public void print(List<String> list){
		System.out.println("Все найденные числа в тексте записанные в шестиричной системе счисления");
		for (int i = 0; i < list.size(); i++){
			
		System.out.println(list.get(i));
		}
	}

}
