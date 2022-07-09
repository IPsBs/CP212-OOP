package lab9;
import javax.swing.JOptionPane;

public class Lab9Program2 {

	public static void main(String[] args) {
	//Receive a string from user
		String str = JOptionPane.showInputDialog(null,"Enter a word of soundex:");
	//Display output by calling soundex method
		JOptionPane.showMessageDialog(null,soundex(str));
	}

	private static char getCode(char c) {
	//Use switch-case to check character of c, then assign a code 1,2,3,4,5,6 or 9 (default case)
		switch (c) {
		// B,F,P,V =>1
		case 'B':
		case 'F':
		case 'P':
		case 'V':
			return '1';
		//C,G,J,Q,S,X,Z =>2
		case 'C':
		case 'G':
		case 'J':
		case 'Q':
		case 'S':
		case 'X':
		case 'Z':
		return '2';
		//D,T =>3
		case 'D':
		case 'T':
			return '3';
		//L =>4
		case 'L':
			return '4';
		//M,N =>5
		case 'M':
		case 'N':
			return '5';
		//R => 6
		case 'R':
			return '6';
		default:
		return '9';
		}
	}

	public static String soundex(String s) {
		StringBuilder code = new StringBuilder();
                //get the first letter from string s and convert to uppercase
		char first = s.toUpperCase().charAt(0);
		//append object code with variable first
		code.append(first);
		//assign the code of the first letter to variable previous
		char previous = getCode(first);
		//assign the code for each character in string s
		for (int i = 1; i < s.length(); i++) {
			char current = getCode(s.toUpperCase().charAt(i));
			//Check the rule in question 2, then append code of current character to object code
			if ((current > '0')&&(current < '9') && !(current == previous)) {
				code.append(current);
			}
			previous = current;
		}
		String soundex = code.append("0000").substring(0,4);
		return soundex;
	}

}
