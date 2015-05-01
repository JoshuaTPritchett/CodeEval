import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class CountingPrimes
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(new FileReader(file));
		while(scanner.hasNext())
		{
			String[] line = scanner.nextLine().trim().split("[,]");
			int numberOne = Integer.parseInt(line[0]);
			int numberTwo = Integer.parseInt(line[1]);
			int numberPrimes = 0;
			for(int i = numberOne; i <= numberTwo; i++)
			{
				if(isPrime(i))
					numberPrimes++;
			}
			System.out.println(numberPrimes);
		}//END WHILE
	}//END MAIN
	 public static boolean isPrime(int n) {
		for(int i = 2; i<=n / 2; i++)
			if(n % i  == 0)
				return false;
		
		return true;
   }
}//END CLASS
