import java.io.*;
import java.util.*;
public class StringsTest {


	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		String line;
		while(scanner.hasNextLine())
		{
			line = scanner.nextLine();
			System.out.println(getBeauty(line));
			
		}


	}
	public static long getBeauty(String s) {
		int i = -1;
		Map<Character, Integer> lettersOccurencesMap = new HashMap<Character, Integer>();
		try {
			while (true) {
				i++;
				Character c = s.charAt(i);
				c = Character.toLowerCase(c);
				if (c < 'a' || c > 'z') {
					continue;
				}
				// Increasing the number of occurence by 1
				Integer occurence = lettersOccurencesMap.get(c);
				if (occurence == null) {
					occurence = 1;
				} else {
					occurence++;
				}
				lettersOccurencesMap.put(c, occurence);
			}
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Reached @ the end of the string");
		}

		ArrayList<Integer> integerList = new ArrayList<Integer>(
				lettersOccurencesMap.keySet().size() * 4 / 3);
		for (Character letter : lettersOccurencesMap.keySet()) {
			integerList.add(lettersOccurencesMap.get(letter));
			System.out.print(lettersOccurencesMap.get(letter));
		}

		// Collection.sort sorts in ascending order
		Collections.sort(integerList);

		Long beauty = 0L;

		int nextHighestBeauty = 26;
		for (i = integerList.size() - 1; i >= 0; i--) {
			Integer occurence = integerList.get(i);
			beauty = beauty + (occurence * nextHighestBeauty);
			nextHighestBeauty--;
		}
		return beauty;
	}
}
