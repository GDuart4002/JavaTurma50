package JavaBloco1;

import java.util.*;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int n1,n2,n3;

		System.out.printf("Entre com o 1º número: ");
		n1 = ler.nextInt();
		System.out.printf("Entre com o 2º número: ");
		n2 = ler.nextInt();
		System.out.printf("Entre com o 3º número: ");
		n3 = ler.nextInt();
		
		if(n1<n2)
		{
			if(n2<n3)
			{
				System.out.println("A ordem crescente correta é: " + (n1) + " " + (n2) + " " + (n3));
			}
			else if(n1<n3) 
			{
				System.out.println("A ordem crescente correta é: " + (n1) + " " + (n3) + " " + (n2));
			} 
			else 
			{
				System.out.println("A ordem crescente correta é: " + (n3) + " " + (n1) + " " + (n2));
			}
		}
			else if(n2<n3) 
			{
				if(n1<n3) 
				{
					System.out.println("A ordem crescente correta é: " + (n2) + " " + (n1) + " " + (n3));
				}else 
				{
					System.out.println("A ordem crescente correta é: " + (n2) + " " + (n3) + " " + (n1));
				}
			} 
			else 
			{
				System.out.println("A ordem crescente correta é: " + (n3) + " " + (n2) + " " + (n1));
			}
	}
}
