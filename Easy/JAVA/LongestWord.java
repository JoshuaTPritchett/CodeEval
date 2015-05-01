import java.io.File;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class LongestWord {
    public static void main(String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line ="";
	while((line = buffer.readLine()) != null) {
		String[] split = line.split("\\s+");
		int result = 0;
		String answer="";
		for(int i = 0; i < split.length; i++)
		{
			if(result < split[i].length())
			{
				result = split[i].length();
				answer = split[i];
			}
			
		}
		System.out.println(answer);
		
	
	}
    }
}
