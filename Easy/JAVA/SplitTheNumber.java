import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
public class SplitTheNumber{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		
		while((line = buffer.readLine()) != null){
				String[] values = line.trim().split("\\s+");
				String numbers = values[0];
				String equation = values[1];
				int result = 0;
				if(equation.indexOf("+") != -1){
					int index = equation.indexOf("+"); 
					int firstNum = Integer.parseInt(numbers.substring(0, index));
					int secondNum = Integer.parseInt(numbers.substring(index));
					result = firstNum + secondNum; 
					
				}
				else{
					int index = equation.indexOf("-"); 
					int firstNum = Integer.parseInt(numbers.substring(0, index));
					int secondNum = Integer.parseInt(numbers.substring(index));
					result = firstNum - secondNum; 
				}
				System.out.println(result);
		}//END WHILE
	}//END MAIN
}//END CLASS
