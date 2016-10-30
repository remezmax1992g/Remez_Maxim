package by.htp6.remez.rel;

public class InheritEx {

	public static void main(String[] args) {
			Man man = new Doctor();
			man.m();
			
			/*meth(new Man());
			meth(new Doctor());
			meth(new HeadDoctor());*/
			
	}
	


}
class Man{
	static void m(){
		
	}
}

class Doctor extends Man{
	static void m(){
		System.out.println("aa");
	}
}
class HeadDoctor extends Man{}
