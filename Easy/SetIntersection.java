import java.io.*;
import java.util.*;

public class SetIntersection
{
	public static void main(String[] args) throws FileNotFoundException
	{
		File file = new File(args[0]);
		Scanner scanner = new Scanner(file);
		while(scanner.hasNextLine())
		{
			int last = 0;
			String[] split = scanner.nextLine().split(";");
			String[] listOne = split[0].split(",");
			String[] listTwo = split[1].split(",");
			TreeSet<Integer> tree = new TreeSet<Integer>();
			for( int i = 0, z = 0; i < listOne.length && z < listTwo.length;)
			{
				int  valueOne = Integer.parseInt(listOne[i]);
				int  valueTwo = Integer.parseInt(listTwo[z]);
				if(valueOne < valueTwo)
					i++;
				else if(valueTwo < valueOne)
					z++;
				else
				{
					tree.add(valueOne);
					i++;
					z++;
					last = valueOne;
				}//END ELSE
					
			}//END FOR 1
			
			tree.remove(last);

			for(int valueOne : tree)
				System.out.print(valueOne + ",");
			
			if(last != 0)
				System.out.print(last);
			
			System.out.println();	
		}//END WHILE
	}//END MAIN
}//END SETINTERSECTION CLASS
