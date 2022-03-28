//Questao 5 - Ler dois valores reais, correspondentes ao peso e à altura de uma pessoa, e calcular o Índice de Massa Corporal(IMC), 
//pela fórmula: IMC=peso/altura². Em seguida, dar mensagem conforme a seguinte tabela.

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
			System.out.println("Está abaixo do peso.");
		} else if (imc <= 18.5 && imc <= 25.0) {
			System.out.println("Está com o peso normal.");
		} if (imc > 25.0 && imc <= 30.0) {
			System.out.println("Está acima do peso.");
		} else if (imc > 30.0) {
			System.out.println("Está obeso(a)");
		}
	}

}
