package prova;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um n�mero inteiro:");
		num = ler.nextInt();
		int novo = num + 2;
		int div1 = (num + 2) % 5;
		if(div1 == 0) {
			System.out.println("O n�mero digitado arredondado �: " + novo);
		} else {
			System.out.println("O n�mero sem arredondar �: " + num);
		}

	}

}
