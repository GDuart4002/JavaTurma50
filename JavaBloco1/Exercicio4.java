package JavaBloco1;

import java.util.*;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero,resto;
		
		System.out.printf("Digite um número: ");
		numero = ler.nextInt();
		
		resto = numero % 2;
		
		if(resto == 0)
		{
			System.out.println("O número " + numero + " é par " + "\nA raiz quadrada é: " +Math.sqrt(numero));
		}
		else
		{
			System.out.printf("O número "+ numero + " é impar " + "\nO número elevado é: " + numero*numero);
		}
	}
}
