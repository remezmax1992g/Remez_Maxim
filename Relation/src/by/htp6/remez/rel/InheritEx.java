package by.htp6.remez.rel;

public class InheritEx {

	public static void main(String[] args) {
			Man man = new Doctor();
			man.m();
			
			/*meth(new Man());
			meth(new Doctor());
			meth(new HeadDoctor());*/
			
	}
	
	/*public static void meth(Man man){
		
		Doctor doc;
		if (man.getClass() == Doctor.class){
			doc = (Doctor)man;
			System.out.println("doctor");
		}
		else
		if(man.getClass() == HeadDoctor.class){
			doc = (Doctor)man;
			System.out.println("HeadDoctor");
		}
	}
		
		public static void meth2(Man man){
			
			Doctor doc;
			if (man instanceof Doctor){
				doc = (Doctor)man;
				System.out.println("doctor");
			}
	}*/

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
