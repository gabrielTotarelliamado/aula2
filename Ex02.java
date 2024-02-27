package view;

import java.util.Scanner;

import controller.Exc02con;

public class Ex02 {

	public static void main(String[] args) {
		Ex02 exc02 = new Ex02();
		Scanner sc = new Scanner(System.in);
 		System.out.println("digite o valor de A: ");
 		int a = sc.nextInt();
 		System.out.println("digite o valor de B: ");
 		int b = sc.nextInt();
 		double menos= 0;
 		double c = Exc02con.sub(a,b,menos );
 		
 		System.out.println(" a divisao dos valores digitados é igual a: "+ c);
	}

}
