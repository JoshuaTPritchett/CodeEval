public class PrimePalindrome
{
	public static int highestPrime = 0;
	public static int testPrime = 0;
	public static void main(String[] args)
	{
		
		for(int i = 0; i < 1000; i++)
		{
		  
			if (i == 2 || i == 3) 
			{highestPrime = i; i++;}
        		if (i % 2 == 0) 
			{i++;}
        		
			int sqrt = (int) Math.sqrt(i) + 1;
        		
			for (int q = 3; q < sqrt; q += 2) 
			{if (i % q == 0){i++;}}
        		
			isPalindrome(i);
			if (highestPrime < testPrime)
				highestPrime = testPrime;
			
		
		
		}
		
		System.out.println(highestPrime);
	}
	
	public static void isPalindrome(int number)
	{

		int palindrome =  number;
		int reverse = 0;
		for (int i = 0; i <= number ; i++) {
			int remainder = number % 10;
        		number = number / 10;
       			reverse = reverse * 10 + remainder;
		}
		if( palindrome == reverse)
		{testPrime = palindrome;}
		
	}

}
