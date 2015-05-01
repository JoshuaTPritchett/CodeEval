import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class CompressedSequence{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
				
				String[] numbers = line.trim().split("\\s+");
				StringBuilder sb = new StringBuilder();
				int frequency = 1;
				
				for(int i =1; i < numbers.length; i++){

						if(Integer.valueOf(numbers[i]) != Integer.valueOf(numbers[i-1])){
							sb.append(frequency+ " " + numbers[i - 1] + " ");
							frequency =1;
						}
						else{
							frequency ++;
						}
				}
				sb.append(frequency + " " + numbers[numbers.length - 1]);
				System.out.println(sb);
		}//END WHILE
	}//END MAIN
	
}//END CLASS
