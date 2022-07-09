package homework;

import java.util.Scanner;

public class EX_11 {

	public static void main(String[] args) {
		int a = 0,e=0,i=0,o=0,u=0;
	      System.out.println("Vowel counts for the sentence");
	      Scanner sc = new Scanner(System.in);
	      String sentence = sc.nextLine();
	      
	      for (int n=0 ; n<sentence.length(); n++){
	         char ch = sentence.charAt(n);
	         switch(ch) {
	         case'a':case'A':
	        	 a++;
	        	 break;
	         case'e':case'E':
	        	 e++;
	        	 break;
	         case'i':case'I':
	        	 i++;
	        	 break;
	         case'o':case'O':
	        	 o++;
	        	 break;
	         case'u':case'U':
	        	 u++; 
	        	 break;
	         }
	   }
	      System.out.println("# of 'a' : "+a);
	      System.out.println("# of 'e' : "+e);
	      System.out.println("# of 'i' : "+i);
	      System.out.println("# of 'o' : "+o);
	      System.out.println("# of 'u' : "+u);
	}
}