import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class MultiplyLists{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
				
				String[] numbers = line.trim().split("\\|");
				String[] left = numbers[0].trim().split("[\\s+]");
				String[] right = numbers[1].trim().split("[\\s+]");
				StringBuilder result = new StringBuilder();
				for(int i = 0; i < right.length; i++){
					int one = Integer.parseInt(left[i]);
					int two = Integer.parseInt(right[i]);
					result.append(one * two + " ");
				}
				System.out.println(result);
		}//END WHILE
	}//END MAIN
	
}//END CLASS
