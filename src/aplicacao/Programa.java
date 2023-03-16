package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		int a, b, r;
		String nome;
		char continuar = 's';
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o seu nome: ");
		nome = sc.nextLine();
		System.out.println("--- soma e par impar ---");
		System.out.println("Entre com um número : ");
		a = sc.nextInt();
		System.out.println("Entre com outro número : ");
		b = sc.nextInt();
		somaParImpar(a, b);

		/*
		 * do { System.out.println("--- calculadora ---"); double resultado =
		 * calculadora(); System.out.println("Resultado = " + resultado);
		 * System.out.println("Continuar (S)im ou (N)ão: "); continuar =
		 * sc.next().charAt(0); } while (continuar == 's');
		 */

		/*
		 * while (continuar == 's') { System.out.println("--- calculadora ---"); double
		 * resultado = calculadora(); System.out.println("Resultado = " + resultado);
		 * System.out.println("Continuar (S)im ou (N)ão: "); continuar =
		 * sc.next().charAt(0); }
		 */

		for (int i = 1; i <= 3; i++) {
			System.out.println("--- calculadora ---");
			double resultado = calculadora();
			System.out.println("Resultado = " + resultado);
		}
		sc.close();
	}

	public static void somaParImpar(int a, int b) {
		int r = a + b;
		if ((r > 0) && ((r % 2) == 0)) {
			System.out.println(r + " é positivo e par");
		} else {
			if ((r > 0) && ((r % 2) != 0)) {
				System.out.println(r + " é positivo e impar");
			} else {
				if ((r < 0) && ((r % 2) == 0)) {
					System.out.println(r + " é negativo e par");
				} else {
					System.out.println(r + " é negativo e impar");
				}
			}
		}
	}

	public static double calculadora() {
		double n1, n2, r = 0;
		char op;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número: ");
		n1 = sc.nextDouble();
		System.out.println("Informe outro número: ");
		n2 = sc.nextDouble();
		System.out.println("Informe a operação (+, -, *, /): ");
		op = sc.next().charAt(0);
		switch (op) {
		case '+':
			r = n1 + n2;
			break;
		case '-':
			r = n1 - n2;
			break;
		case '*':
			r = n1 * n2;
			break;
		case '/':
			r = n1 / n2;
			break;
		default:
			System.out.println("Operador inválido");
			break;
		}
		return r;
	}

}
