import java.io.*;
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
	   for(int i = 1; i <= Integer.parseInt(parts[2]); i++)
	   {
		if( i % Y == 0 && i % X == 0)
		{System.out.print( "FB" + " ");}
		else if( i % X == 0)
		{System.out.print( "F" + " ");}
		else if( i % Y == 0)
		{System.out.print( "B" + " ");}
		else
		{System.out.print(i + " ");}
	   }
	
	   System.out.println();
        }
	   
	
    }
}
