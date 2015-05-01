import java.io.FileNotFoundException;
import java.io.File;
import java.util.Scanner;

public class PenultimateWord
{
	public static void main(String[] args) throws FileNotFoundException
	{

		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			
			String[] line = scanner.nextLine().split("[\\s+]");
			int secondLast = line.length-2;
			System.out.println(line[secondLast]);
		}

	}



}
