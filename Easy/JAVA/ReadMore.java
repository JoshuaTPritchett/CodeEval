import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadMore
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(new FileReader(file));
		while(scanner.hasNext())
		{
			String line = scanner.nextLine().trim();
			if(line.length() <= 55)
				System.out.println(line);
			
			else
			{	
				int i = 39;

				while ( i>= 0 && line.charAt(i) !=' ')
					i--;

				if(i != -1)
					System.out.println(line.substring(0,i) + "... <Read More>");
				else
					System.out.println(line.substring(0,40) + "... <Read More>");
			}//END ELSE
		}//END WHILE
	}//END MAIN
}//END CLASS
