package view;

import java.util.Scanner;
import controll.*;
public class Exc001 {

	public static void main(String[] args) {
		Exc001 exc01 = new Exc001();
		Scanner sc = new Scanner(System.in);
 		System.out.println("digite o valor de A: ");
 		int a = sc.nextInt();
 		System.out.println("digite o valor de B: ");
 		int b = sc.nextInt();
 		int soma = 0;
 		int c = Exc01cont.recur(a,b,soma );
 		
 		System.out.println(" a multiplicação dos valores digitados é igual a: "+ c);
 		}

}
