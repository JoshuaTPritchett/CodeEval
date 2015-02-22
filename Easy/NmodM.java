import java.io.*;
import java.util.*;

public class NmodM
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);	
		while(scanner.hasNextLine())
		{ 
			String[] numbers = scanner.nextLine().split(",");
			int firstNum = Integer.parseInt(numbers[0]);
			int secondNum = Integer.parseInt(numbers[1]);
			int modResult =  firstNum - ((firstNum/secondNum) * secondNum);
			System.out.println(modResult);
			
		}
	}
}
