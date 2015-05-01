import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader; 

public class DecimalToBinary {
    public static void main(String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line = "";
	while((line = buffer.readLine()) != null) {
		int number = Integer.parseInt(line);
		System.out.println(Integer.toBinaryString(number));	
	
	}
    }
}
