import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class MultiplesOfANumber
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		String[] split = null;
	
		while((line = reader.readLine()) != null)
		{	
	
			split = line.split(",",line.length());
			int total = 0;
			int x = Integer.parseInt(split[0]);
			int n = Integer.parseInt(split[1]);
			while( x > total)
			{
				total += n;
			}
			System.out.println(total);
		
		}

	}


}


