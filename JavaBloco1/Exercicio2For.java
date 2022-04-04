package JavaBloco1;

import java.util.*;

public class Exercicio2For {
	public static void main(String[] args) {
		
		int num, x,contPar=0, contImpar=0;
		Scanner ler = new Scanner(System.in);
		for(x=1;x<=10;x++)
		{
			System.out.print("Entre com um valor: ");
			num = ler.nextInt();
			if(num % 2 == 1)
		{
			contImpar++;
		}
			if(num % 2 ==0)
		{
			contPar++;
		}
		}
		System.out.printf("Números Impares: \n"+contImpar);
		System.out.printf("\nNúmeros Pares: \n"+contPar);
	}
}
