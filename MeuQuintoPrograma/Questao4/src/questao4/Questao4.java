//Questao 4 - Ler valores para os tr�s lados de um tri�ngulo e dizer o seu tipo (eq�il�tero, is�sceles ou escaleno).

package questao4;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual o valor do primeiro lado do tri�ngulo? ");
		float l1 = in.nextFloat();
		System.out.println("Qual o valor do segundo lado do tri�ngulo? ");
		float l2 = in.nextFloat();
		System.out.println("Qual o valor do terceiro lado do tri�ngulo? ");
		float l3 = in.nextFloat();
		
		if (l1 == l2 && l1 != l3) {
			System.out.println("O tri�ngulo � Is�celes.");
		} if (l1 == l3 && l2 != l3) {
			System.out.println("O tri�ngulo � Is�celes.");
		} if (l1 == l3 && l2 == l3 && l1 == l3) {
			System.out.println("O tri�ngulo � Equil�tero.");
		} if (l1 != l2 && l2 != l3 && l1 != l3) {
			System.out.println("O tri�ngulo � Escaleno."); 
		}

	}

}
