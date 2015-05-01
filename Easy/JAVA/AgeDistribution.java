import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class AgeDistribution{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
				line = line.trim();
				getYear(line);
		}//END WHILE
	}//END MAIN
	static void getYear(String line)
	{
			int test = Integer.valueOf(line);
			
			if(test < 0 || test > 100)
				System.out.println("This program is for humans");
			if(test <= 2) 
				System.out.println("Still in Mama's arms");
			else if(test <= 4) 
				System.out.println("Preschool Maniac");
			else if(test <= 11) 
				System.out.println("Elementary  school");
			else if(test <= 14) 
				System.out.println("Middle school");
			else if(test <= 18) 
				System.out.println("High school");
			else if(test <= 22) 
				System.out.println("College");
			else if(test <= 65) 
				System.out.println("Working for the man");
			else  
				System.out.println("The Golden Years");

	}
}//END CLASS
