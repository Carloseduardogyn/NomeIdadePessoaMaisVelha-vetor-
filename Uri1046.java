package Uri;

import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao;

		if (inicio >= fim) {
			duracao = (24 + fim) - inicio;

		} else {
			duracao = fim - inicio;

		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

		sc.close();

	}

}
