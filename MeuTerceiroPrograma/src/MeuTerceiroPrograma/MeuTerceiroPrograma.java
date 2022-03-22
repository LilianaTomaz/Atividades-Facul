// Programa 3 - Ler dois valores inteiros, calcular o produto destes dois valores sem usar o operador *, imprimir o resultado
package MeuTerceiroPrograma;

import java.util.Scanner;

public class MeuTerceiroPrograma {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in); 				
		System.out.println("Digite um valor: ");  
		int x = in.nextInt();
		System.out.println("Digite outro valor: "); 
		int y = in.nextInt();		
		
		int r = 0;
		while (y > 0) {
			r = r + x;
			y = y - 1;
	}
		System.out.println(r);
		
	}

}