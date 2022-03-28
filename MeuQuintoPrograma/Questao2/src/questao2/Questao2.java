// Questão 02 - Ler um valor real correspondente a uma nota, tal que 0 ≤ nota ≤ 10, e imprimir o conceito equivalente A, B, C, D ou E.
package questao2;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o valor da nota: ");
		float n = in.nextFloat();
		
		
		if ( n <= 10.0 && n >= 8.5 ) { 
			System.out.print("A");
		} 
		
		if ( 7.0 <= n && n < 8.5 ) { 
			System.out.println("B");
		}
		
		if ( n < 7.0 && n >= 5.0) {
			System.out.println("C");
		} 
		
		if ( n < 5.0 && n >= 3.0) {
			System.out.println("D");
		} 
		
		if ( n < 3.0) {
			System.out.println("E");
		
		
			}
		
	}
}