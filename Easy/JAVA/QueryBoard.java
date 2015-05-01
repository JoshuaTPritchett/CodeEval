import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
public class QueryBoard{
		
	static int[][] board = new int[256][256];
	public static void main(String[] args) throws FileNotFoundException
	{
		//Read in the Input file for the given problem
		File file = new File(args[0]);
		Scanner scan = new Scanner(new FileReader(file));
			
		//Create and Initialize the board values to 0 as requested by the problem
		for(int i = 0; i < board.length; i++)
				for(int z = 0; z < board.length; z++)
						board[i][z] = 0;

		//As long as a line exist the in Scanner read in the lines and do work!
		while(scan.hasNext()){
				String[] line = scan.nextLine().trim().split("[\\s+]");
				String call = line[0];				

				//Functionality of the program will vary based on input line size
				//IF line length equals 2 THEN				
				if(line.length == 2)
				{		
					//We know it will just be a sum Query
					//SET x to the first position of line of type String
					int iOrj = Integer.parseInt(line[1]);
					
					//Do validation for the board values
					if(iOrj < 0 || iOrj > 256)
						continue;
		
					CheckFunctionCall(call, iOrj, 0);
				}
				if(line.length == 3)
				{
					//We know we will be changing values
					int iOrj = Integer.parseInt(line[1]);
					int x = Integer.parseInt(line[2]);

					//Do validation for the board values
					if(iOrj < 0 || iOrj > 256)
							continue;
					if(x < 0 || x >31)
							continue;

					CheckFunctionCall(call, iOrj, x);
					

				
				}
				
		}//END WHILE

	}//END MAIN

	
	static void CheckFunctionCall(String call, int a, int x)
	{
		if(call.equals("SetCol"))
			SetCol(a, x);
		else if(call.equals("SetRow"))
			SetRow(a, x);
		else if(call.equals("QueryRow"))
			QueryRow(a);
		else if(call.equals("QueryCol"))
			QueryCol(a);
	}
	static void SetRow(int i, int x)
	{
		for(int j = 0; j < board.length; j++)
			board[i][j] = x;
	}
	static void SetCol(int j, int x)
	{
		for(int i = 0; i < board.length; i++)
			board[i][j] = x;
	}
	static void QueryRow(int i)
	{
		int sum = 0;
		for(int j = 0; j < board.length; j++)
			sum += board[i][j];
		System.out.println(sum);
	}
	static void QueryCol(int j)
	{
		int sum = 0;
		for(int i = 0; i < board.length; i++)
			sum += board[i][j];
		System.out.println(sum);
	}

}//END CLASS
