import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Stack;
public class ValidParentheses{
	public static void main(String[] args) throws IOException{
		File file = new File (args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while((line = buffer.readLine()) != null){
				line = line.trim();
				if(validate(line))
					System.out.println("True");
				else
					System.out.println("False");
		}


	}
	static boolean validate(String line)
	{
		Stack<Character> stack = new Stack<Character>();
		for(int i = 0; i < line.length(); i++)
		{
			char c = line.charAt(i);
			if( c == '(' || c == '[' || c == '{')
					stack.push(c);
			else if(stack.isEmpty() || !matching(stack.pop(),c))
					return false;
		}
		return stack.isEmpty();
	}
	static boolean matching(char open, char closed)
	{
		 if (open == '(')
            return closed == ')'; 
         else if (open == '[') 
            return closed == ']';
         else 
            return closed == '}';
	}
}
