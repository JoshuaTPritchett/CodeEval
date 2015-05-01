import java.io.BufferedReader;
import java.io.FileReader;
import java.io.File;
import java.io.IOException;

public class SwapElements{
	public static void main(String[] args) throws IOException{
			File file = new File(args[0]);
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			String line;
			while((line = buffer.readLine()) != null){
				String[] fullStringSplit = line.trim().split(":");
				String[] leftSideSplit = fullStringSplit[0].trim().split(" ");
				String[] indexes = fullStringSplit[1].trim().split(",");
				for(int i = 0; i < indexes.length; ++i){
					indexes[i] = indexes[i].trim();
					String[] values = indexes[i].split("-");
					int first = Integer.valueOf(values[0]);
					int second = Integer.valueOf(values[1]);
					String temp = leftSideSplit[first];
					leftSideSplit[first] = leftSideSplit[second];
					leftSideSplit[second] = temp;
				}
				for(int i = 0; i < leftSideSplit.length; ++i){
					System.out.print(leftSideSplit[i]);
					System.out.print(" ");
				}
				System.out.println();
			}
	}



}
