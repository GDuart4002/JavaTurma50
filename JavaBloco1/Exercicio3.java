package JavaBloco1;

import java.util.*;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int idade;
		
		System.out.printf("Digite sua idade: ");
		idade = ler.nextInt();
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("Voc� � do Infantil");
		}
		else if(idade>=15 && idade<=17)
		{
			System.out.println("Voc� � do Juvenil");
		}
		else if(idade>=18 && idade<=25)
		{
			System.out.println("Voc� � do Adulto");
		}
		else
		{
			System.out.println("Voc� n�o se encaixa em nossas categorias");
		}
	}
}
