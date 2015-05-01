import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

///Work in Progress
public class DecodeNumbers {
    public static void main(String[] args) throws IOException {
	File file = new File(args[0]);
	BufferedReader buffer = new BufferedReader(new FileReader(file));
	String line;
	while((line = buffer.readLine()) != null) {
		line = line.trim();
		if(line.length() == 0)
				continue;
		
		int decode = 0;	
		for(int i = 0; i < line.length(); i++){
				if(i == line.length() -1 && line.charAt(i) != '0' )
						decode = 1;
				if((line.charAt(i) == '1' || line.charAt(i) =='2') && (i+1) < line.length() &&
					line.charAt(i + 1) >= '0' && line.charAt(i + 1) <='6')
    						decode+= decode + 1;
				else 
						decode ++;

				
    		
		}
			System.out.println(decode);
	}//END WHILE
    }//END MAIN

	
	
}
