// Programa 1 - Ler dois valores inteiros, calcular o produto destes dois valores, imprimir o resultado.

package MeuPrimeiroPrograma;

import java.util.Scanner;

public class MeuPrimeiroPrograma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Digite um valor: ");  
		int v1 = in.nextInt();
		System.out.println("Digite outro valor: "); 
		int v2 = in.nextInt();
		System.out.println("O valor do produto dos número é: "+v1*v2);


	}

}