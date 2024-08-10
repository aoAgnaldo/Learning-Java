/* Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
mensagem explicativa, conforme exemplos. */

import java.util.Scanner;

public class SomaDoisNumeros{
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("1st number: ");
		int a=sc.nextInt();
		System.out.print("2th number: ");
		int b=sc.nextInt();
		System.out.println();
		int sum=a+b;
		System.out.println("SOMA= "+sum);
		System.out.println();
		System.out.println("BEIJO ATE MAIS!");
		sc.close();
	}		
}