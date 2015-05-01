import java.io.*;
public class SumOfDigits
{


	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null)
		{
			line.trim();
			int lineTotal = 0;
			for(int i = 1; i <=line.length(); i++)
			{lineTotal += Integer.parseInt(line.substring(i-1,i));}
			System.out.println(lineTotal);
		}


	}

}
