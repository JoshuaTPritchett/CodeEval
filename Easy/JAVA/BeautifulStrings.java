import java.io.*;
import java.util.*;
public class BeautifulStrings
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			HashMap<Character, Integer> OccuringLetters = new HashMap<Character,Integer>();
			String line = scanner.nextLine();
			
			for(int i = 0; i < line.length(); i++)
			{
				Character character = line.charAt(i);
				character = Character.toLowerCase(character);
				if(character < 'a' || character > 'z')
					continue;
				Integer frequency = OccuringLetters.get(character);
				if(frequency == null)
					frequency = 1;
				else 
					frequency++;
				OccuringLetters.put(character, frequency);
				
			}//END FOR
				
			ArrayList<Integer> frequencyList =
						 new ArrayList<Integer>(OccuringLetters.size()*4/3);
							
			for(Character a : OccuringLetters.keySet())
			{
				frequencyList.add(OccuringLetters.get(a)); 
				
			}
			Collections.sort(frequencyList, Collections.reverseOrder());
		
			int beauty =0;
			int highestBeauty = 26;
			for(int i = 0; i < frequencyList.size(); i++)
			{
				Integer value = frequencyList.get(i);
				beauty = beauty + (value*highestBeauty);
				highestBeauty--;
			}
			System.out.println(beauty);
		}
	}
}

