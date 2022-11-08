import java.util.Scanner;
import java.util.Stack;

public class BalanceBrackets {
	
	public static void main(String[] args) {
		String input="";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the equetion");
		input = sc.next();
		if(input.length()%2 !=0) {
			System.out.println("Incomplete equetion");
			
		}
		else {
			if(checkBracket(input)) {
				System.out.println("balanced equetion");
			}
			else {
				System.out.println("Unbalanced equetion");
			}
		}
	}

	private static boolean checkBracket(String input) {
		
		Stack<Character> stack = new Stack<>();
		for(char k : input.toCharArray()) {
			if(k=='{' || k=='['|| k=='(') {
				stack.push(k);
				continue;
			}
			if(stack.isEmpty())
				return false;
			char z;
			switch (k) {
			case '}':
				z= stack.pop();
				if(z=='[' || z=='(')
					return false;
				break;
			case ']':
				z= stack.pop();
				if(z=='{' || z=='(')
					return false;
				break;
			case ')':
				z= stack.pop();
				if(z=='[' || z=='{')
					return false;
				break;
				
			}
		}
		return (stack.isEmpty());
	}

}









