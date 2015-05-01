import java.io.*;
import java.util.*; 

public class NumberOfOnes {
    public static void main(String[] args) throws FileNotFoundException {
	File file = new File(args[0]);
	Scanner in = new Scanner(file);
		
	while(in.hasNextLine()) {
		String line = in.nextLine();
		int number = Integer.parseInt(line);
		System.out.println(Integer.bitCount(number));	
	
	}
    }
}
