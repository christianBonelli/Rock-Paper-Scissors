package MyGame;

public class Game {
	public String play(Card playerChoice, Card computerChoice) { //Questo è un metodo che prende due parametri di tipo Card e restituisce una string che mostra il risultato
		if(playerChoice == computerChoice) {
			return "It's a tie!";
		}else if((playerChoice == Card.ROCK && computerChoice == Card.SCISSORS) ||
				(playerChoice == Card.PAPER && computerChoice == Card.ROCK) ||
				(playerChoice == Card.SCISSORS && computerChoice == Card.PAPER)) {
			return "You Win!";
		}else {
			return "Computer Wins!";
		}
			
	}

}
