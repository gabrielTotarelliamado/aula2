package view;
import controller.*;
import java.util.Scanner;
public class Exc03 {

	public static void main(String[] args) {
		
		Exc03 exc03 = new Exc03();
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o tamanho do vetor: ");
 		int a = sc.nextInt();
 		int[] vetor = new int[a];
 		int b = 0;
 		int soma = 0;
 		int c = exc03con.recursiva(vetor, a,b,soma );
 		
 		System.out.println(" a quantidade de numeros pares, são: "+ c);
 		sc.close();
	}

}
