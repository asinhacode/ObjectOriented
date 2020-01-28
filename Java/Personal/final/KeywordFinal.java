package finaL;

public class KeywordFinal 
{
	final String name;
	final static int reference = 10; 
	static int referenceCount  = 0; 

	

	public KeywordFinal(String n)
	{
		this.name = n;
		referenceCount++;
	}

	public String getName() 
	{
		return name;
	}
	
	public static int getReference() {
		return reference;
	}

	public static int getReferenceCount() {
		return referenceCount;
	}

}
