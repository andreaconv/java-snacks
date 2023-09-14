package org.java;

import java.util.Scanner;

public class Snacks {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//SNACK 1
		//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		System.out.print("Inserisci un numero: ");
		int numInserito = sc.nextInt();
		
		if(numInserito % 2 == 0) {
			System.out.println("il numero inserito è pari: " + numInserito);
		} else {
			System.out.println("il numero successivo è: " + (numInserito + 1));			
		}
		
	}

}
