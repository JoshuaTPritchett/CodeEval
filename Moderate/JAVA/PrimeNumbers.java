import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
public class PrimeNumbers{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null)
		{
			line = line.trim();	
			int numberOne = Integer.parseInt(line);
			StringBuilder sb = new StringBuilder();
			if(numberOne > 2)
				sb.append(2).append(",");
			for(int i = 3; i < numberOne; i+=2)
			{	
				if(isPrime(i))
					sb.append(i).append(",");
			}
			System.out.println(sb.deleteCharAt(sb.length()-1));

		}//END WHILe

	}//END MAIN
	public static boolean isPrime(int n) {
		int sqrt = (int) Math.ceil(Math.pow(n, .5));
		for (int i = 3; i <= sqrt; ++i) {
			if (n % i == 0)
				return false;
		}
		return true;
   }
}//END CLASS
