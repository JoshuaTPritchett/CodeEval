import java.io.*;
import java.util.*; 

public class TrailingString {
    public static void main(String[] args) throws FileNotFoundException {
	File file = new File(args[0]);
	Scanner in = new Scanner(file);
		
	while(in.hasNextLine()) {
		String[] line = in.nextLine().split("[,]");
		String firstend = line[0].trim();
		String lastend = line[1].trim();
		if(lastend.length() > firstend.length())
			System.out.println(0);
		else
		{	
			String compare = firstend.substring(firstend.length() - lastend.length());
			if(compare.equals(lastend))
				System.out.println(1);
			else
				System.out.println(0);
		}
	
	}
    }
}
