package br.target;

import java.util.Scanner;

public class Questão5 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.print("Digite a string a ser invertida: ");
		String text = scan.nextLine();
		
		char[] character = text.toCharArray();
		
		for (int i = 0, j = character.length - 1; i < j; i++, j--) {
			char temp = character[i];
			character[i] = character[j];
			character[j] = temp;
		}
		
		String textoInvertido = new String(character);
		
		System.out.println("String invertida: " + textoInvertido);
	}

}
