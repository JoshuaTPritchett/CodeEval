import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;
public class LettercasePercentageRatio
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(new FileReader(file));
		while(scanner.hasNext())
		{
			String line = scanner.nextLine();
			double lowerCase = 0;
			double upperCase = 0;
			
			for(int i = 0; i < line.length(); i++)
			{
				if(Character.isLowerCase(line.charAt(i)))
					lowerCase++;
				if(Character.isUpperCase(line.charAt(i)))
					upperCase++;
			}
			if( lowerCase > 0)
				lowerCase = (100.00 * lowerCase) / Double.valueOf(line.length());
			if(upperCase > 0)
				upperCase = (100.00 * upperCase) / Double.valueOf(line.length());
			DecimalFormat df = new DecimalFormat("0.00");
			System.out.println("lowercase: " + df.format(lowerCase) + " uppercase: " + df.format(upperCase));
			
		}


	}

}
