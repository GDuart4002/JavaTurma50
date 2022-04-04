package JavaBloco1;

import java.util.*;

public class Exercicio3While {
	public static void main(String[] args) {
		
		int idade, cont21=0, cont50=0;
		Scanner ler = new Scanner(System.in);
		System.out.print("Entre uma idade: ");
		idade = ler.nextInt();
		
		while(idade!=-99)
		{
			if (idade<=21 && idade>=0)
			{
				cont21++;
			}
			if (idade>=50)
			{
				cont50++;
			}
			System.out.print("Entre uma idade: ");
			idade = ler.nextInt();
		}
		System.out.println("O total de pessoas com menos de 21 anos é"+cont21);
		System.out.println("O total de pessoas com menos de 21 anos é"+cont50);
	}
}
