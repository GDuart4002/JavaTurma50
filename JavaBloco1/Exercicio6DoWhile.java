package JavaBloco1;

import java.util.*;

public class Exercicio6DoWhile {
	public static void main(String[] args) {
		
		int num, resto, soma=0, cont=0, media;
		Scanner ler = new Scanner(System.in);
		do
		{
			System.out.printf("Digite qualquer número: ");
			num = ler.nextInt();
			resto =  num%3;
			if(resto==0 && num>0){
				soma+=num;
				cont++;
			}
		}while(num!=0);
		media=soma/cont;
		System.out.printf("A media dos números é: "+media);
	}
}