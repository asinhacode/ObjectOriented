package seven;
import java.security.SecureRandom;

public class Deck 
{
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	public Deck()
	{
		String[] faces = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
		String[] suits = {"Heart", "Clubs", "Diamonds", "Clubs"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int count = 0; count < deck.length; count++)
		{
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
			
		}
	}
	
	
}
