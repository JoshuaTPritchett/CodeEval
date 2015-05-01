import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.TreeSet;


public class SetIntersection
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line ="";
		while((line = buffer.readLine()) != null)
		{
			int last = 0;
			String[] split = line.split(";");
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
