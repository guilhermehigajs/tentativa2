package Application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.println("Digite seu nome : ");
		String nome = ler.nextLine();
		System.out.println("Digite sua idade :");
		int num = ler.nextInt();
	}
}
