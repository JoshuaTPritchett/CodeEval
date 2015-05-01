import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class MaxRangeSum{
	public static void main(String[] args) throws IOException{
			File file = new File(args[0]);
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line;
			while((line = buffer.readLine()) != null){
					line = line.trim();
					String[] leftRight = line.split(";");
					String[] rightSplit = leftRight[1].trim().split(" ");
					int[] intArray = new int[rightSplit.length];

					for(int i = 0; i < rightSplit.length; ++i)
						intArray[i] = Integer.parseInt(rightSplit[i]);
					
					java.util.Arrays.sort(intArray);
					
					for(int i : intArray)
						System.out.println(i);
			}

	}

}
