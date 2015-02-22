import java.io.*;
public class BitPositions
{

	public static void main(String[] args) throws IOException
	{
		File file = new File(args[0]);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String line;
		String[] split = null;
		while((line = reader.readLine()) != null)
		{
			line = line.trim();
			split= line.split(",",line.length());
			int primary = Integer.parseInt(split[0]);
			int first = Integer.parseInt(split[1]);
			int second = Integer.parseInt(split[2]);
			if (((primary >> (first-1))&1) == ((primary >> (second-1))&1)) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

		
	}

}
