import java.io.*;
public class RightmostChar
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null)
		{
			int value= -1;
			line = line.trim();
			for(int i = 0; i < line.length()-2; i++)
			{
				if(line.charAt(i) == line.charAt(line.length()-1))
				{value = i;}
			
						
			}
			System.out.println(value);
		}	
	}



}
