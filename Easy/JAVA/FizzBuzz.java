import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class FizzBuzz {
    public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line; 	
		int X;
		int Y;
		String[] parts = null;
        while ((line = buffer.readLine()) != null) {
           parts = line.trim().split("\\s+");
		   X = Integer.parseInt(parts[0]);
		   Y = Integer.parseInt(parts[1]);

		   StringBuilder result = new StringBuilder();
		   for(int i = 1; i <= Integer.parseInt(parts[2]); i++)
		   {
				if( i % Y == 0 && i % X == 0)
				 result.append( "FB" + " ");
				else if( i % X == 0)
				 result.append( "F" + " ");
				else if( i % Y == 0)
				 result.append( "B" + " ");
				else
				 result.append(i + " ");
		   }
	
		   System.out.println(result);
	 }
		   
	
    }
}
