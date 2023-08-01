package Casting;

public class Casting4 extends Casting3 {
	
	public void Demo3() {
		System.out.println("Demo 3 - method");
	}
	public static void main(String[] args) {
		
		Casting4 C4 = new Casting4();   // static binding + CTP + Early binding
		C4.Demo1();
		C4.Demo2();
		C4.Demo3();
		
		System.out.println();
		 
		// upcasting
		
		Casting3 C3 = new Casting4();   // upcasting + top casting + dynamic poly + RTP + late binding
		C3.Demo1();
		C3.Demo2();
		
		// down casting
		
		Casting4 C2 = (Casting4)new Casting3();  // classcast exception
		C2.Demo1();
		C2.Demo2();
		C2.Demo3();
		
	}

}
