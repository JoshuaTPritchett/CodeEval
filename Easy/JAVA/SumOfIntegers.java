import java.io.*;
public class SumOfIntegers
{


	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		int lineTotal=0;
		while((line = buffer.readLine()) != null)
		{
			line = line.trim();
			lineTotal += Integer.parseInt(line);
			
		}

			System.out.println(lineTotal);
	}

}
