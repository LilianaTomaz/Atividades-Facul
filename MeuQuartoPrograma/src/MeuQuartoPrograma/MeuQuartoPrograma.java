// Programa 4 -Escreva um programa que pede o nome e a idade (inteiro) e peso (double) de uma pessoa e imprime uma mensagem com tais informações. 
// O peso tem que ser impresso com duas casas decimais.

package MeuQuartoPrograma;

import java.util.Scanner;

public class MeuQuartoPrograma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = in.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = in.nextInt();
		System.out.println("Digite seu peso: ");
		double peso = in.nextDouble();
		System.out.printf("%s, %d anos, pesa %.2f kg!", nome, idade, peso);

	}

}
