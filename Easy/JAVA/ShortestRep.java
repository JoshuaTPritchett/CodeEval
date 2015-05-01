import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeSet;
public class ShortestRep
{
	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line = "";
		while((line = buffer.readLine()) != null)
		{
			TreeSet<Character> tree = new TreeSet<Character>();
			int result = 0;
			String compare = "";
			for(int i = 0; i < line.length(); i++)
			{
				boolean c = tree.contains(line.charAt(i));
				if( c == false)
				{	
					tree.add(line.charAt(i));
				}
			}
			result = tree.size();
			System.out.println(result);
		}


	}

}
