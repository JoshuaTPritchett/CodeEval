import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Details{
	public static void main(String[] args)throws FileNotFoundException{
		File file = new File(args[0]);
		Scanner scan = new Scanner(new FileReader(file));
		while(scan.hasNext()){
			String linestr = scan.nextLine().trim();
			if(linestr.length()==0)
				continue;
			String[] line = linestr.split("[,]");
			int counter = 0;
			while(true){
			boolean stop = false;
			for(int i = 0; i < line.length; i++){
				//sSystem.out.println(line[i]);
				if(line[i].contains(".Y") && !line[i].contains("XY"))
				{
					line[i]=line[i].replace(".Y","Y");
					//System.out.println(line[i]);
				}
				else 
				{stop=true;break;}	
			}//end 1 for
				if(stop)
					break;
				counter += 1;
			}//endWHILE 
			System.out.println(counter);
			
		}	
	}

}
