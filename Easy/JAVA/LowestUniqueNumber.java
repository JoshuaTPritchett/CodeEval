import java.io.*;
import java.util.*;
public class LowestUniqueNumber
{

	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			HashMap<Integer,Integer> numbers = new HashMap<Integer,Integer>();
			String[] split = scanner.nextLine().split("[ \t]+");
			for(int i = 0; i < split.length; i++)
			{	
				int number = Integer.parseInt(split[i]);
			 	if(numbers.containsKey(number))
					numbers.put(number, numbers.get(number) +1);
				else
					numbers.put(number, 1);
				
			}
			
			int min = Integer.MAX_VALUE;
			for(int a : numbers.keySet())
			{	
				if(numbers.get(a) == 1)
				{min = Math.min(min, a);}
				
			}
			int lowest = 0;
			for(int i = 0; i < split.length; i++)
			{
				if(Integer.parseInt(split[i]) == min)
					lowest = i +1 ;
			}
			
			if(lowest != 0)
				System.out.println(lowest);
			else
				System.out.println("0");
		}

	}

}



