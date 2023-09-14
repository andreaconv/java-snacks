package org.java;

import java.util.Random;
import java.util.Scanner;

public class Snacks {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//SNACK 1
		//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
		//System.out.print("Inserisci un numero: ");
		//int numInserito = sc.nextInt();
		
		//if(numInserito % 2 == 0) {
		//	System.out.println("il numero inserito è pari: " + numInserito);
		//} else {
		//	System.out.println("il numero successivo è: " + (numInserito + 1));			
		//}
		//--------------------------------------------------------
		
		//SNACK 2
		//Generatore di “nomi cognomi” casuali: il Grande Gatsby ha  una lista di nomi e una lista di cognomi, 
		//e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
		
		String[] nomi = {
				"Giovanni", "Marco", "Antonio", "Luca", "Michele", "Alessio"
		};
		
		String[] cognomi = {
				"Rossi", "Bianchi", "Russo", "Esposito", "Martini", "Ferrari",
		};
		
		String[] invitati = new String[nomi.length];
		
		Random rnd = new Random();
		
		for(int i=0; i<nomi.length; i++) {
			invitati[i] = nomi[rnd.nextInt(nomi.length - 1)] + " " + cognomi[rnd.nextInt(cognomi.length - 1)];
			System.out.println(invitati[i]);
		}
		//--------------------------------------------------------
		
	}

}
