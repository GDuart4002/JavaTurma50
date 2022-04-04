package JavaBloco1;

import java.util.*;

public class Exercicio4While {
	public static void main(String[] args) {
		
		int idade, sexo, opcoes, stop; 
		int cont1=0, cont2=0, cont3=0, cont4=0, cont5=0, cont6=0, cont7=0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		idade=ler.nextInt();
		
		System.out.println("Digite seu sexo dentre as opções:");
		System.out.println("(1-feminino / 2-masculino / 3-Outros)");
		sexo=ler.nextInt();
		
		System.out.println("Digite seu secsu dentre as opções:");
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
			
			System.out.println("Digite seu sexo dentre as opções:");
			System.out.println("(1-feminino / 2-masculino / 3-Outros)");
			sexo=ler.nextInt();
			
			System.out.println("Digite seu secsu dentre as opções:");
			System.out.println("(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era\r\n"
					+ "agressiva).");
			opcoes=ler.nextInt();
			
			cont7++;
		}
		System.out.println("O número de pessoas calmas é: "+cont6);
		System.out.println("O número de mulheres nervosas é: "+cont5);
		System.out.println("O número de homens agressivos é: "+cont4);
		System.out.println("O número de outros calmos é: "+cont3);
		System.out.println("O número de pessoas nervosas com mais de 40 anos é: "+cont2);
		System.out.println("O número de pessoas calmas com menos de 18 anos é: "+cont1);
	}
}
