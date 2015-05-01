import java.io.*;
import java.util.*;

public class HexToDecimal
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			int hex = Integer.parseInt(line, 16);
			System.out.println(hex);
		}
	}
}

