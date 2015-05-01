import java.io.*;
import java.util.*; 

public class Combinatorics {
    public static void main(String[] args) throws FileNotFoundException {
	File file = new File(args[0]);
	Scanner in = new Scanner(file);
		
	while(in.hasNextLine()) {
		String line = in.nextLine();
		HashMap<Character, Integer> numberMap = new HashMap<Character,Integer>();
		int n = line.length();
		int numberOfTimes = 0;
		int division = 0;	
		int total = 0;
		for(int i = 0; i < line.length(); i++)
		{
			Character character = line.charAt(i);
			Integer frequency = numberMap.get(character);
			if(frequency == null)
				frequency = 1;
			else
				frequency++;
			numberMap.put(character, frequency);
		}//END FOR
		n = factorial(n);
		for(Character a : numberMap.keySet())
		{
			division = factorial(numberMap.get(a));
		}
		division *= division;
		total = n / division;
		System.out.println(total);
	}//END WHILE
    }//END MAIN

	public static int factorial(int n)
	{
		int fact = 1;
		for(int i = 1; i<=n; i++)
			fact *=i;
		return fact;

	}
}
