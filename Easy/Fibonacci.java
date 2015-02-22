import java.io.*;
public class Fibonacci
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null)	
		{
			line=line.trim();
			long l = Long.parseLong(line);
			System.out.println(Fib(l));
		}

	}

	public static long Fib(long i)
	{
		if(i == 0)
			return 0;
		if(i == 1)
			return 1;
		else
			return Fib(i-1) + Fib(i-2);
	
	}


}
