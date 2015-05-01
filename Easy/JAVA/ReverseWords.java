import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 
public class ReverseWords
{
	public static void main(String[] args) throws Exception
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		String[] split;
		String reversedLine= "";
		while((line = buffer.readLine()) != null)
		{
			split = line.split("\\s+");
			for(int i = split.length-1; i>=0 ; i--)
			{
			reversedLine += split[i] + " ";
			
			}
			reversedLine += "\n";
		}
		
		System.out.print(reversedLine);

	}


}
