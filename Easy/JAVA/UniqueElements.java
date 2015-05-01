import java.io.*;
import java.util.*;
public class UniqueElements
{
	/* Uses a treeset that is excellent for storing a list of sorted elements
	   Big-O of add log n; contains log n; and next log n.
	*/
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null)
		{
			TreeSet<Integer> tree = new TreeSet<Integer>();
			String[] split = line.trim().split(",", line.length());
			int last = 0;
			for(int i = 0; i < split.length; i++)
			{
				int parse = Integer.parseInt(split[i]);
				tree.add(parse);
				last = parse;
			}
					

			tree.remove(last);

			for(int parse : tree)
				System.out.print(parse + ",");
			System.out.print(last);
			System.out.println();
		}


	}


}
