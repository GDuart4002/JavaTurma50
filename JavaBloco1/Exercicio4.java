package JavaBloco1;

import java.util.*;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int numero,resto;
		
		System.out.printf("Digite um n�mero: ");
		numero = ler.nextInt();
		
		resto = numero % 2;
		
		if(resto == 0)
		{
			System.out.println("O n�mero " + numero + " � par " + "\nA raiz quadrada �: " +Math.sqrt(numero));
		}
		else
		{
			System.out.printf("O n�mero "+ numero + " � impar " + "\nO n�mero elevado �: " + numero*numero);
		}
	}
}
