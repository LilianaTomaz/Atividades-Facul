//Questão 1 - Um programa que lê três números inteiros distintos e imprime o maior dos três.

package meuquintoprograma;

import java.util.Scanner;

public class MeuQuintoPrograma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primeiro valor inteiro: ");
		int n1 = in.nextInt();
		System.out.println("Digite o segundo valor inteiro: ");
		int n2 = in.nextInt();
		System.out.println("Digite o terceiro valor inteiro: ");
		int n3  = in.nextInt();
		
		if ( (n1 > n2) && (n1 > n3) ) { 
			System.out.println("O maior número entre eles é: "+n1);
			} else if (n2 > n3) { 
			System.out.println("O maior número entre eles é: "+n2);
			} else {
			System.out.println("O maior número entre eles é: "+n3);
			}

	}
}