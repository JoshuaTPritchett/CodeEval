import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 

public class CapitalizeWords {
    public static void main(String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line = "";
	while((line = buffer.readLine()) != null) {
		String[] all = line.trim().split("[\\s+]");
		StringBuilder result = new StringBuilder();
		for(int i = 0; i < all.length; i++)
		{
		result.append(Character.toUpperCase(all[i].charAt(0)) + all[i].substring(1) + " ");
		}
		System.out.println(result); 
			
	
	}
    }
}
