import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Hashtable;
public class RaceTrack{
public static void main(String[] args)throws FileNotFoundException{
	File file = new File(args[0]);
	Scanner scanner = new Scanner(new FileReader(file));
	int position = 0;
	while(scanner.hasNext()){
		String line = scanner.nextLine().trim();
		String result ="";
		Hashtable<Character,Integer> HT = new Hashtable<Character, Integer>();
		for(int i = 0; i < line.length(); i++)
		{
			if(line.charAt(i) == 'C')
			{
				HT.put(line.charAt(i), i);
				result+= " ";
			}
			else if(line.charAt(i) == '_')
			{
				HT.put(line.charAt(i), i);
				result+= "x";
			}
			else
			{result +=line.charAt(i);}
		}
		if(HT.containsKey('C'))
		{
			if(position ==0)
				{result= result.replace("x","_");
				 result= result.replace(" ","|");position = HT.get('C');}
			else if(position == HT.get('C'))
				{result= result.replace("x","_");
				 result= result.replace(" ","|");}
			else if(position > HT.get('C'))
				{result= result.replace("x","_");
				 result= result.replace(" ","/");
				 position = HT.get('C');}	
			else
				{result= result.replace("x","_");
				 result= result.replace(" ","\\");
				 position =HT.get('C');}		
		}
		else
		{
			if(position ==0)
				{result= result.replace("x","|");position = HT.get('_');}
			else if(position == HT.get('_'))
				{result= result.replace("x","|");}
			else if(position > HT.get('_'))
				{result= result.replace("x","/");position = HT.get('_');}	
			else
				{result= result.replace("x","\\"); position =HT.get('_');}	
		}
		System.out.println(result);
	}//ENDWHILE
	


	}
}

