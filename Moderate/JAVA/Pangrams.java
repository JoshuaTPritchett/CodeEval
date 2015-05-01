import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class Pangrams{
	public static void main(String[] args) throws IOException{
			File file = new File(args[0]);
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line = "";			
			String alphabet = "abcdefghijklmnopqrstuvwxyz";	
			while((line = buffer.readLine()) != null){
						line = line.toLowerCase();
						StringBuilder result = new StringBuilder();
						for( int i = 0; i < alphabet.length(); i++){
								String letter = "" + alphabet.charAt(i);
								if(!line.contains(letter))
										result.append(letter);
						}
						if(result.length() == 0)
							System.out.println("NULL");
						else
							System.out.println(result);
			}
	}



}
