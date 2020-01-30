package seven;

public class Card 
{
	private final String face;
	private final String suit;
	
	public Card(String f, String s)
	{
		face = f;
		suit = s;
	}
	
	public String toString()
	{
		return face + " of " + suit;
	}
	
	
}
