import java.io.*;
import java.util.*;
public class ReverseAndAdd
{

	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			String[] split = scanner.nextLine().split("[;]");
			int num = Integer.parseInt(split[0]);
			int iteration = 0;
			while(!isPalindrome(num))
			{
				int reversed = ReverseInt(num);
				iteration++;
				num += reversed;
			}
			System.out.println(iteration + " " + num);
		}
		
	}
	//modified coding
	private static boolean isPalindrome(int number)
	{
		String numberS = String.valueOf(number);
		for(int a = 0, b = numberS.length()-1;  a <= b; a++, b--)
			if(numberS.charAt(a) != numberS.charAt(b))
				return false;
					
		return true;
	}
	private static int ReverseInt(int num)
	{
		int reverse = 0;
		int input = num;
		while (input != 0)
		{
			reverse = reverse * 10 + input % 10;
			input = input / 10;
		}
		return (int)reverse;
	}	
	
}



