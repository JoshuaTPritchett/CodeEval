import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;
public class PalindromicRanges
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null)
		{
			line = line.trim();
			if(line.length() == 0)
				continue;
			String[] lines = line.split("[\\s+]");
			int left = Integer.valueOf(lines[0]);
			int right = Integer.valueOf(lines[1]);
			int total = 0;
			for(int i = left; i <= right; i++)
			{
			 	for(int j = i; j <= right; j++)
				{
						int number = 0;
						for(int z = i; z <=j; z++){
							if(isPalindrome(z))
									{number++;}
						}
						if(number%2 ==0)
							{total++;}
				}

			}
		
			System.out.println(total);
		}
	}
	
	public static boolean isPalindrome(int number)
	{

			int palindrome = number;
			int reverse = 0;
			while (palindrome > 0) {
				// Pop off last digit
				// and then add onto 10 * r
				reverse = reverse * 10 + (palindrome % 10);
				palindrome = palindrome / 10;
			}
			if (number == reverse) 
				return true;
			else 
				return false;
	}

}
