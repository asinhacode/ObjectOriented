package finaL;

public class TesterFinal 
{

	public static void main(String[] args) 
	{
		KeywordFinal first = new KeywordFinal("John");
		
		System.out.println(KeywordFinal.getReferenceCount()); // 1
		
		System.out.println(KeywordFinal.getReference()); // stays the same

		KeywordFinal last = new KeywordFinal("Smith");
		
		System.out.println(first.getName());
		System.out.println(last.getName());
		
		// can't be done
		//first.name = "Smith";
		
		System.out.println(KeywordFinal.getReference()); // still same
		
		System.out.println(KeywordFinal.getReferenceCount()); // 2


	}
	

}
