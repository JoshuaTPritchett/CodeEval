import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;

public class SwapCase {
    public static void main(String[] args) throws IOException{
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line = "";
	while((line = buffer.readLine()) != null) {
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < line.length(); i++)
		{
			char character = line.charAt(i);
			if(character >= 'a' && character <='z')
				character = Character.toUpperCase(character);
			else
				character = Character.toLowerCase(character);
			result.append(character);
		}
		System.out.println(result);
			
	
	}
    }
}
