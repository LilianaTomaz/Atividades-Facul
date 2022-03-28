//Questão 3 - Ler dois valores reais, x e y, correspondentes às coordenadas de um ponto no plano e dizer em que quadrante se encontra,
// ou se está no eixo-x ou no eixo-y ou se está na origem.

package questao3;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a coordenada correspondente a 'x': ");
		int x = in.nextInt();
		System.out.println("Digite a coordenada correspondente a 'y': ");
		int y = in.nextInt();
		
		if (x > 0 && y < 0 ) {
			System.out.println("As coordenadas se encontram no quadrante 4º.");
		}
		if (x < 0 && y < 0 ) {
			System.out.println("As coordenadas se encontram no quadrante 3º.");
		}
		if (x < 0 && y > 0) {
			System.out.println("As coordenadas se encontram no quadrante 2º.");
		}
		if ( x > 0 && y > 0 ) {
			System.out.println("As coordenadas se encontram no quadrante 1º.");
		}
		if ( x == 0 && y > 0 ) {
			System.out.println("As coordenadas se encontram no eixo 'x'.");
		}
		if ( x == 0 && y < 0 ) {
			System.out.println("As coordenadas se encontram no eixo 'x'.");
		}
		if ( x > 0 && x < 0 && y == 0) {
			System.out.println("As coordenadas se encontram no eixo 'y'.");
		}
		if ( x > 0 && y == 0) {
			System.out.println("As coordenadas se encontram no eixo 'y'.");
		}
		if ( x == 0 && y == 0 ) {
			System.out.println("As coordenadas se encontram no centro(na origem).");
		
		}

	}

}
