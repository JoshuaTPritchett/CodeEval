import java.io.*;
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
	
			line = line.trim();
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


