package JavaBloco1;

import java.util.*;

public class Exercicio4While {
	public static void main(String[] args) {
		
		int idade, sexo, opcoes, stop; 
		int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade=ler.nextInt();
		
		System.out.println("Digite seu sexo dentre as op��es:");
		System.out.println("(1-feminino / 2-masculino / 3-Outros)");
		sexo=ler.nextInt();
		
		System.out.println("Digite seu secsu dentre as op��es:");
		System.out.println("(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era\r\n"
				+ "agressiva).");
		opcoes=ler.nextInt();
		
		cont7++;
		if(opcoes==1)
		{
			cont6++;
		}
		if(sexo==1 && opcoes==2)
		{
			cont5++;
		}
		if(sexo==2 && opcoes==3)
		{
			cont4++;
		}
		if(sexo==3 && opcoes==1)
		{
			cont3++;
		}
		if(idade>40 && opcoes==2)
		{
			cont2++;
		}
		if(idade<18 && opcoes==1)
		{
			cont1++;
		}

		while(cont7<150 && idade>=1 && sexo>=1 && sexo<=3 && opcoes>=1 && opcoes<=3)
		{
			if(opcoes==1)
			{
				cont6++;
			}
			if(sexo==1 && opcoes==2)
			{
				cont5++;
			}
			if(sexo==2 && opcoes==3)
			{
				cont4++;
			}
			if(sexo==3 && opcoes==1)
			{
				cont3++;
			}
			if(idade>40 && opcoes==2)
			{
				cont2++;
			}
			if(idade<18 && opcoes==1)
			{
				cont1++;
			}
			System.out.println("Digite sua idade: ");
			idade=ler.nextInt();
			
			System.out.println("Digite seu sexo dentre as op��es:");
			System.out.println("(1-feminino / 2-masculino / 3-Outros)");
			sexo=ler.nextInt();
			
			System.out.println("Digite seu secsu dentre as op��es:");
			System.out.println("(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era\r\n"
					+ "agressiva).");
			opcoes=ler.nextInt();
			
			cont7++;
		}
		System.out.println("O n�mero de pessoas calmas �: "+cont6);
		System.out.println("O n�mero de mulheres nervosas �: "+cont5);
		System.out.println("O n�mero de homens agressivos �: "+cont4);
		System.out.println("O n�mero de outros calmos �: "+cont3);
		System.out.println("O n�mero de pessoas nervosas com mais de 40 anos �: "+cont2);
		System.out.println("O n�mero de pessoas calmas com menos de 18 anos �: "+cont1);
	}
}
