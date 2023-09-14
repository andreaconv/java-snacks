package org.java;

import java.util.Arrays;
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
		
//		String[] nomi = {
//				"Giovanni", "Marco", "Antonio", "Luca", "Michele", "Alessio"
//		};
//		
//		String[] cognomi = {
//				"Rossi", "Bianchi", "Russo", "Esposito", "Martini", "Ferrari",
//		};
//		
//		String[] invitati = new String[nomi.length];
//		
//		Random rnd = new Random();
//		
//		for(int i=0; i<nomi.length; i++) {
//			invitati[i] = nomi[rnd.nextInt(nomi.length - 1)] + " " + cognomi[rnd.nextInt(cognomi.length - 1)];
//			System.out.println(invitati[i]);
//		}
		//--------------------------------------------------------
		
		//SNAK 3
		//Crea un array di numeri interi e fai la somma di tutti gli elementi  che sono in posizione dispari
//		
//		int[] numeri = {1, 3, 5, 7, 12, 15, 17, 23, 28, 31, 37, 44, 47, 51, 59};
//		
//		int sum = 0;
//
//		for(int i=0; i<numeri.length; i++) {
//			
//			if(!(i % 2 == 0)) {
//				
//				sum += numeri[i];
//			}
//		}
//		System.out.println(sum);
		//--------------------------------------------------------
		
//		SNACK 4
		//Data in input una stringa verificare se è palindroma
		
//		System.out.print("inserire una parola: ");
//		String parolaInserita = sc.nextLine();
//		
//		//divido la stringa in caratteri singoli
//		char[] parolaScomposta = parolaInserita.toCharArray();
//		System.out.println("parola scomposta: " + Arrays.toString(parolaScomposta));
//		
//		//creo un array lungo qunato la parola
//		char[] parolaScompostaInvertita = new char[parolaScomposta.length];
//		
//		//inizializzo una variabile x che prende il valore della lunghezza dell'array -1
//		//(sarà il numero dell'ultimo indice 
//		int x=parolaScomposta.length-1;
//		
//		//ad ogni ciclo l'indice viene sostituito con le lettere
//		for(int i=0; i<parolaScomposta.length; i++) {
//			parolaScompostaInvertita[x] = parolaScomposta[i];
//			x = x-1;
//		}
//		System.out.println("parola  scomposta Invertita: " + Arrays.toString(parolaScompostaInvertita));
//		
//		//creo una nuova stringa con l'array invertito
//		String parolaInvertita = new String(parolaScompostaInvertita);
//		System.out.println("parola Invertita: " + parolaInvertita);
//		
//		//il metodo equals() confronta due stringhe e restituisce true se è vero
////		if(parolaInvertita.equals(parolaInserita)) {
////			System.out.println("la parola inserita è palindroma");
////		}else {
////			System.out.println("la parola inserita non è palindroma");
////		}
//		
//		//stessa condizione con l'operatore ternario
//		System.out.println(
//				parolaInvertita.equals(parolaInserita)
//				? "la parola inserita è palindroma"
//				: "la parola inserita non è palindroma"
//				);
//		//--------------------------------------------------------
//		
//		//SNACK 5
		//Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e 
		//quanti simboli non alfanumerici. Continuare a chiedere una nuova stringa finchè non si inserisce 0.
		
//		String parolaInserita = null;
//		
//		do {
//			System.out.print("inserire una parola mista");
//		    parolaInserita = sc.nextLine();
//		    
//		    int lettere = 0;
//		    int numeri = 0;
//		    int simboli = 0;
//		    
//			
//			for(int i=0; i<parolaInserita.length(); i++) {
//				char carattere = parolaInserita.charAt(i);
//				
//				 if (Character.isLetter(carattere)) {
//					 lettere++;
//		            } else if (Character.isDigit(carattere)) {
//		            	numeri++;
//		            } else {
//		            	simboli++;
//		            }
//			}
//			
//			String msgL = (lettere == 1 ? " lettera, " : " lettere, ");
//			String msgN = (lettere == 1 ? " numero, " : " numeri, ");
//			String msgS = (lettere == 1 ? " simbolo, " : " simboli, ");
//			
//			System.out.println("nella parola che hai inserito ci sono " 
//			+ lettere + msgL
//			+ numeri + msgN 
//			+ simboli + msgS);
//			
//		} while (!parolaInserita.equals("0"));
//		//--------------------------------------------------------
		
		//SNACK 6
		//Dato un numero sotto forma di stringa, convertirlo in intero senza utilizzare funzioni già pronte.
		//Possibile usare solo :
		//
		//cicli
		//chartAt
		//if / switch
		//Es. “25” come stringa deve essere convertito in intero 25.
		
//		String strNum = "25";
//		
//		System.out.println(strNum);
//		System.out.println(strNum + 2);
//		
//		int intNum = 0;
//
//		for(int i = 0; i < strNum.length(); i++) {
//			intNum = (intNum * 10 ) + ((int)strNum.charAt(i) - 48);
//		}
//
//		System.out.println(intNum);
//		System.out.println(intNum + 2);
		
//		//--------------------------------------------------------
		
		//SNACK 7
		//Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri a video la stringa generata 		(secondi → “hh:mm:ss”)
		
		System.out.print("Inserisci i secondi da convertire: ");
        int secondiCompleti = sc.nextInt();
		
		int ore = secondiCompleti / 3600;
        int minuti = (secondiCompleti % 3600) / 60;
        int secondi = (secondiCompleti % 3600) % 60;

        String conversione = String.format("%02dh %02dm %02ds", ore, minuti, secondi);
        System.out.println("La conversione è: " + conversione);
        
//		//--------------------------------------------------------
	}

}
