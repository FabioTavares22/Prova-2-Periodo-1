package prova;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int vetorA = 3;
		int valores[] = new int[vetorA];
		for (int i = 0; i < vetorA; i++) {
			System.out.println("Digite o número desejado:");
			valores[i] = ler.nextInt();
			}
		for (int i = 0; i < vetorA; i++) {
			if(valores[i] % 11 == 0 || valores[i] % 17 == 0 || valores[i] % 13 == 0) {
				System.out.println("Este é o menor número: " + valores[i]);
			}
		}

	}
}
