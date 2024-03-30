package MyGame;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);//Oggetto Scanner che leggerà l'input dell'utente
		Game game = new Game();//Istanza della classe Gme per poter usare il metodo .play()
		Random random = new Random();//Oggetto random che servirà per generare la scelta casuale del computer
		game.playerCounter = 0;
		game.computerCounter = 0;
		
		while(true) {//Blocco while che si ripeterà finche il giocatore non sceglie 'no'
			System.out.println("Enter your Choice (ROCK, PAPER, SCISSORS): ");
			String playerInput = scanner.next().toUpperCase();//Lettura dell'input dell'utente e conversione della stringa in maiuscolo
			Card playerChoice = Card.valueOf(playerInput); //Conversione della stringa inserit dall'utente in un valore dell'enumerazione Card usando il metodo valueOf()
			
			//Riga di codice che genera la scelta del computer
			//Card.values() Restituisce un array contenente i valori dell'enumerazione 'Card'
			//random.nextInt Genera un numero all'interno di un range, in questo caso Caard.values() è il nostro range
			//[.....]QUesta prte di codice genera un numero compreso tra 0 e la lunghezza dell'array. E ci ritornerà l'indice dell'array che corrisponderà alla carta
			Card computerChoice = Card.values()[random.nextInt(Card.values().length)];//Card.vlues().length restituisce la lunghezza dell'array di valori dell'enumerazione 'Card'
			
			String result = game.play(playerChoice, computerChoice);//Questa riga di codice chiama il metodo .play() a cui viene passato l scelta del giocatore e del computer
			System.out.print(result);
			System.out.println("\nYour points: " + game.playerCounter + "\nComputer Points: " + game.computerCounter);
			
			//System.out.println("Do you want to play again? (yes/no)");
			//String playAgain = scanner.next();
			if(game.playerCounter == 3 || game.computerCounter == 3) {//Controllo che la risposta si diversa da 'yes' ignorando le differenze di maiuscole
				if(game.playerCounter == 3) {
					System.out.println();
					System.out.println("Congrats! You won the game!");
					break;
				}else {
					System.out.println();
					System.out.println("Sorry but the computer Won the Game. If you want to play again press F11");
					break;
				}
			}
			
		}
		scanner.close();//Chiusura di scanner per liberare risorse

	}

}
