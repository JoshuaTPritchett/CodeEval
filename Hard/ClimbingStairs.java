import java.io.BufferedReader;
import java.io.IOException;
import java.io.File;
import java.io.FileReader;

public class ClimbingStairs{
	public static void main(String[] args) throws IOException{
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null)
		{
			line = line.trim();
			int steps = Integer.parseInt(line);
			int i = 0;
				long[] walk = {1,2,0};
				if(steps <= 2)
				{
					if(steps <= 0)
							System.out.println(0);
					else 
							System.out.println(walk[steps-1]);
					continue;
				}
				for(int q = 1; q < steps - 1; q++)
				{
						walk[2] = walk[1] + walk[0];
						walk[0] = walk[1];
						walk[1] = walk[2];

				}
				System.out.println(walk[2]);

				
			
				
		}

	}
}
