package br.target;

import java.util.Scanner;

public class Questao2 {

	public static Scanner scan = new Scanner(System.in);
	
	public static void fibonacci(int _number) {
		int value1 = 0, value2 = 1, value3 = 0, aux = 0;
		
		
		while(aux < 50) {
			value3 = value1 + value2;
			if (_number == value3) {
				System.out.println("O numero " +_number+ " Pertence a sequencia de Fibonacci");
				break;
			}
			value1 = value2;
			value2 = value3;
			
			aux++;
			
		}
		System.out.println("O numero não pertence a sequencia de Fibonacci!");
	}
	
	
	public static void main(String[] args) {
		System.out.println("Escolha o numero que quer verificar");
		int number = scan.nextInt();
		fibonacci(number);
	}
}
