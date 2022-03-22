// Programa 2 - Ler dois valores inteiros, imprimir na tela os valores em ordem crescente

package MeuSegundoPrograma;

import java.util.Scanner;

public class MeuSegundoPrograma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Digite um valor: ");  
		int v1 = in.nextInt();
		System.out.println("Digite outro valor: "); 
		int v2 = in.nextInt();
		
		if (v1 > v2)  {
			System.out.print(v2+", "+v1);
		}
		else {
			System.out.print(v1+", "+v2);
		}
		
	}
	
}