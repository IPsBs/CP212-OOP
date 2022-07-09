import javax.swing.JOptionPane;

public class Lab8Program2 {

	public static void main(String[] args) {
	//Receive a string from user
		String str = .........
	//Display output by calling soundex method
		...............
	}

	private static char getCode(char c) {
	//Use switch-case to check character of c, then assign a code 1,2,3,4,5,6 or 9 (default case)
		switch (c) {
		// B,F,P,V =>1
		...
		//C,G,J,J,Q,S,X,Z =>2
		...
		//D,T =>3
		...
		//L =>4
		...
		//M,N =>5
		...
		//R => 6
		...
		default =>9
		...
		}
	}

	public static String soundex(String s) {
		StringBuilder code = new StringBuilder();
                //get the first letter from string s and convert to uppercase
		char first = ......
		//append object code with variable first
		............
		//assign the code of the first letter to variable previous
		char previous = ...........
		//assign the code for each character in string s
		for (int i = 1; i < s.length(); i++) {
			char current = .......
			//Check the rule in question 2, then append code of current character to object code
			if (...............................) {
				code.append(current);
			}
			previous = current;
		}
		String soundex = code.append("0000").substring(0,4);
		return soundex;
	}

}
