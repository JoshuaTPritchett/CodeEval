import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class OverlappingRectangles{
	public static void main(String[] args)throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;	
		while((line = buffer.readLine()) != null){
				String[] points = line.split(",");
				//Points for A
				int P1X = Integer.parseInt(points[0]);
				int P1Y = Integer.parseInt(points[1]);
				int P2X = Integer.parseInt(points[2]);
				int P2Y = Integer.parseInt(points[3]);
				//Points for B
				int P3X = Integer.parseInt(points[4]);
				int P3Y = Integer.parseInt(points[5]);
				int P4X = Integer.parseInt(points[6]);
				int P4Y = Integer.parseInt(points[7]);
				if(ComparePoints(P1X, P1Y, P2X, P2Y, 
								 P3X, P3Y, P4X, P4Y))
					System.out.println("True");
				else
					System.out.println("False");
		}
	}
	static boolean ComparePoints(int P1X, int P1Y, int P2X, int P2Y, 
								 int P3X, int P3Y, int P4X, int P4Y)
		
	{
		return (P2Y <= P3Y && P1Y >= P4Y && P2X >= P3X && P1X <= P4X);
	}
	
}
