//Quest�o 1 - Um programa que l� tr�s n�meros inteiros distintos e imprime o maior dos tr�s.

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
			System.out.println("O maior n�mero entre eles �: "+n1);
			} else if (n2 > n3) { 
			System.out.println("O maior n�mero entre eles �: "+n2);
			} else {
			System.out.println("O maior n�mero entre eles �: "+n3);
			}

	}
}