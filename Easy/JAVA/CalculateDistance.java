import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class CalculateDistance{
	public static void main(String[] args) throws IOException{
		File file = new File (args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null){
			line = line.trim();
			Scanner scan = new Scanner(line); 
			String p1 = scan.next() + " " + scan.next(); 
			String p2 = scan.next() + " " + scan.next(); 

			int x1 = Integer.parseInt(p1.substring(1, p1.indexOf(",")));
			int y1 = Integer.parseInt(p1.substring(p1.indexOf(",") + 2, p1.length() - 1)); 
			int x2 = Integer.parseInt(p2.substring(1, p2.indexOf(",")));
			int y2 = Integer.parseInt(p2.substring(p2.indexOf(",") + 2, p2.length() - 1));
			double distance = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
			
			System.out.println((int)distance);
		}
		


	}
}

