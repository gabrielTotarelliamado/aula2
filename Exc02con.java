package controller;

public class Exc02con {
	public Exc02con() {
		super();
	}
	public static double sub(int a, int b, double menos) {
		if(a < b) {
			 return menos;
		 }else {
			 a = a - b;
			 menos = a;
		 }

			return sub(a , b,menos);
			
	}
}
