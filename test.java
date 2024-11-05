package SDET_Training;
class Topic3 {
	final void A1()
	{
		System.out.println("Finalize method called");
	}
}

public class test{
	public static void main(String[] args) {
		Topic3 obj = new Topic3();
		obj = new Topic3();
		obj = new Topic3();	
		obj.A1();
		obj.A1();
	    Runtime.getRuntime().gc(); 
	}
}