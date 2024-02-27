package view;
import java.util.Scanner;
import contreller.exc04con;

public class exc04 {

	public static void main(String[] args) {
		exc04 exc04 = new exc04();
		Scanner sc = new Scanner(System.in);
		int a = 0;
		while (a<=0 || (a%2) != 0 ){
 		System.out.println("digite o valor de A: ");
 		 a = sc.nextInt();
		}
 		double soma= 1;
 		double c = exc04con.sub(a,soma );
 		
 		System.out.println(" a divisao dos valores digitados é igual a: "+ c);
	}

}
