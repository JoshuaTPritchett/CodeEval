import java.io.*;
import java.util.*; 

public class HiddenDigits {
    public static void main(String[] args) throws FileNotFoundException {
	File file = new File(args[0]);
	Scanner in = new Scanner(file);
		
	while(in.hasNextLine()) {
		String line = in.nextLine();
		String answer ="";
		for(int i = 0; i < line.length(); i++)
		{
			Character c = line.charAt(i);
			if( c >= 'a' && c<= 'j')
				answer += c - 'a';
			else if(c >= '0' && c<='9')
				answer += c;		
		}
		if(answer == "")
			System.out.println("NONE");
		else
			System.out.println(answer);
	}
    }
}
