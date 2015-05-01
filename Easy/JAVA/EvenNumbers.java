import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException; 

public class EvenNumbers {
    public static void main(String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader in = new BufferedReader(new FileReader(file));
	String line = "";
	while((line = in.readLine()) != null) {
		int number = Integer.parseInt(line);
		if(number % 2 == 0)	
			System.out.println(1);
		
		else
			System.out.println(0);
			
	
	}
    }
}
