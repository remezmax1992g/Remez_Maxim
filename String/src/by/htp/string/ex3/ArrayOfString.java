package by.htp.string.ex3;

import java.util.Scanner;

public class ArrayOfString {
	
	private String[] array;
	
	public ArrayOfString(int length){
		array = new String[length];
	}
	
	
	public String[] fill (){
		System.out.println("Fill array of String");
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++){
			array[i] = sc.nextLine();
			
		}
		sc.close();
		
		return array;
	}
	public void print(){
		for (int i = 0; i < array.length; i++){
			System.out.println((i +1) + "th string of array: " + array[i]);
		}
	}
	
	public void sort(){
		for (int i = 0; i < array.length; i++){
	    	char[] char1 = array[i].toCharArray();
	    	byte min = (byte)char1[0];
	    	for (int j = i + 1; j < array.length; j++){
	    		char[] char2 = array[j].toCharArray();
	    		byte nextmin = (byte) char2[0];
	    		if (min > nextmin){
	    			min = nextmin;
	    			String temp = array[j];
	    			array[j] = array[i];
	    			array[i] = temp;
	    		}
	    	}
	    }

	}
}

