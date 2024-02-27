package controll;

public class Exc01cont {
	
	public Exc01cont() {
		super();
	}
 
 public static int recur(int a , int b, int soma ) {
	 if(a == 0) {
		 return soma;
	 }else {
		 soma = soma + b;
	 }

		return recur(a-1 , b,soma);
		
		
	}
		

 	
 }

 

