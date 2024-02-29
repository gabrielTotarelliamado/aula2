package controller;
import java.util.Scanner;
public class exc03con {
	public exc03con() {
		super();
		
	}
	
	public static int recursiva(int[]vetor,int a, int b,int soma) {
		Scanner sc = new Scanner(System.in);
		if(a==b) {
			sc.close();
			return soma;
			
		}else {
			System.out.println("digite o numero q sera armazenado: ");
			vetor[b] = sc.nextInt();
			if(vetor[b] % 2 == 0) {
				soma = soma +1;
				
			}
			b = b +1;
		return recursiva(vetor, a, b, soma);
		
		}
		
	}
}
