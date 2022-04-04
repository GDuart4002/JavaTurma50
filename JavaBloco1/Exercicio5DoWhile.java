package JavaBloco1;

import java.util.*;

public class Exercicio5DoWhile {
	public static void main(String[] args) {
		
		int num, soma=0;
		Scanner ler = new Scanner(System.in);
		do
		{
			System.out.printf("Digite qualquer número: ");
			num = ler.nextInt();
			soma+=num;
			
		}while(num!=0);
		System.out.printf("A soma dos números é: "+soma);
	}
}
