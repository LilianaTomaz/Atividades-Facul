//Questao 4 - Ler valores para os três lados de um triângulo e dizer o seu tipo (eqüilátero, isósceles ou escaleno).

package questao4;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do primeiro lado do triângulo? ");
		float l1 = in.nextFloat();
		System.out.println("Qual o valor do segundo lado do triângulo? ");
		float l2 = in.nextFloat();
		System.out.println("Qual o valor do terceiro lado do triângulo? ");
		float l3 = in.nextFloat();
		
		if (l1 == l2 && l1 != l3) {
			System.out.println("O triângulo é Isóceles.");
		} if (l1 == l3 && l2 != l3) {
			System.out.println("O triângulo é Isóceles.");
		} if (l1 == l3 && l2 == l3 && l1 == l3) {
			System.out.println("O triângulo é Equilátero.");
		} if (l1 != l2 && l2 != l3 && l1 != l3) {
			System.out.println("O triângulo é Escaleno."); 
		}

	}

}
