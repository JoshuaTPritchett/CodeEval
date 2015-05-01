import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class WordToDigit{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
				String[] StringNumbers = line.trim().split(";");
				for(int i = 0; i < StringNumbers.length; i++)
				{
					int numberValue	= getNumber(StringNumbers[i]);
					System.out.print(numberValue);
				}
				System.out.println();
		}//END WHILE
	}//END MAIN
	static int getNumber(String line)
	{
			int q = 0;
			switch(line){
			case "zero": q = 0; break;
			case "one": q = 1; break;
			case "two":q = 2; break;
			case "three": q = 3; break;
			case "four": q = 4; break;
			case "five": q = 5; break;
			case "six": q = 6; break;
			case "seven": q = 7; break;
			case "eight": q = 8; break;
			case "nine": q = 9; break;
			}
			return q;
	}
}//END CLASS
