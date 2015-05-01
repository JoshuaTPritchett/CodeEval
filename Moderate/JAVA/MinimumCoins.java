import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
//Simple coin calculator I have done in a previous intro to programming course
public class MinimumCoins
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer= new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null)
		{
			int left = Integer.parseInt(line.trim());
			int fives = left / 5;
			left -= fives * 5;
			int threes = left / 3;
			left -= threes * 3;
			int ones = left;	
			System.out.println(fives + threes + ones);
			
		}//END WHILE
	}//END MAIN
}//END CLASS
