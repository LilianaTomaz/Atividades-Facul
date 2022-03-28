//Questao 5 - Ler dois valores reais, correspondentes ao peso e � altura de uma pessoa, e calcular o �ndice de Massa Corporal(IMC), 
//pela f�rmula: IMC=peso/altura�. Em seguida, dar mensagem conforme a seguinte tabela.

package questao5;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Qual seu peso? ");
		float p = in.nextFloat();
		System.out.println("Qual sua altura? ");
		float a = in.nextFloat();
		double imc = (p/ (a*a));
		
		if (imc <= 18.5) {
			System.out.println("Est� abaixo do peso.");
		} else if (imc <= 18.5 && imc <= 25.0) {
			System.out.println("Est� com o peso normal.");
		} if (imc > 25.0 && imc <= 30.0) {
			System.out.println("Est� acima do peso.");
		} else if (imc > 30.0) {
			System.out.println("Est� obeso(a)");
		}
	}

}
