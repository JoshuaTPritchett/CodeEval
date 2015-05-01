import java.io.*;
import java.util.*;
public class URLComparison
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			String[] split = scanner.nextLine().split("[;]");
			for(String s: split)
				System.out.println(s);
		}

	}

}



