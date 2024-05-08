import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("--# Bem-vindo ao contador de intervalo entre dois números #--");

		System.out.println("Digite o primeiro número: ");
		int num1 = scanner.nextInt();

		System.out.println("Digite o segundo número: ");
		int num2 = scanner.nextInt();

		if (num1 < num2) {
			int contador = num2 - num1;

			for (int i = 0; i <= contador; i++) {
				System.out.println("Imprimindo número: " + i);

			}
		}else {
			System.out.println("Primeiro número não pode ser maior que o segundo número");
		}
	}
}