import java.io.*;
import java.util.*;

public class ArmstrongNumbers
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			String line = scanner.nextLine();
			
			int total = 0;
			for(int i = 0; i < line.length(); i++)
			{
				int numbers = Integer.parseInt(line.charAt(i) + "");
				double powerNum= Math.pow(numbers,line.length());
				total += powerNum;
			}
			if(total == Integer.parseInt(line))
				System.out.println("True");
			else
				System.out.println("False");
		}
	}
}

