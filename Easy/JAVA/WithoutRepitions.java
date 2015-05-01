import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class WithoutRepitions{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
				line = line.trim();
				StringBuilder result = new StringBuilder();
				result.append(line.charAt(0));
				for(int i =1; i < line.length(); i++){
					if(line.charAt(i-1) != line.charAt(i))
							result.append(line.charAt(i));				
				}
				System.out.println(result);
		}//END WHILE
	}//END MAIN
}//END CLASS
