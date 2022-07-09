package lab12;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPet {

	public static void main(String[] args) {
		//Create pets Arraylist
		ArrayList<Pet> pets = new ArrayList<Pet>();
		Scanner scanner = new Scanner( System.in );
		
		while(true) {
			System.out.print("Enter its name and type (‘c’ for cat and ‘d’ for dog). ");
			String strDorC = scanner.next().trim();
			String strEnterDog_Cat = "Enter the name of the ";
			switch (strDorC.charAt(0)) {
				case 'c': strEnterDog_Cat+="Cat <or STOP to Quit>";
					break;
				case 'd': strEnterDog_Cat+="Dog <or STOP to Quit>";
					break;
				default: System.out.print("Invalid choice\n"); 
					continue;
			}
			//Show message for user to enter a pet's name
			System.out.print(strEnterDog_Cat);
			String strInput = scanner.next().trim();
			
			//Add set pet name and add the new pet to ArrayList
			if(!strInput.equals("STOP")) {
				Pet tmpPet = new Pet();
				switch (strDorC.charAt(0)) {
					case 'c': tmpPet = new Cat();
							tmpPet.setName(strInput);
							pets.add(tmpPet);
							break;
					case 'd': tmpPet = new Dog();
							tmpPet.setName(strInput);
							pets.add(tmpPet);
							break;
				}
			}else {
				break;
			} 
		}
		
		// Output the name and type for each pet 
		// and call method speak() or fetch() 
		// which depended on the type of a pet in the ArrayList
		for (int i = 0; i < pets.size(); i++) {
			if (pets.get(i) instanceof Cat) {
		      System.out.printf("%s %s\n",pets.get(i).getName(), ((Cat)pets.get(i)).speak());
			}else {
				System.out.printf("%s %s\n",pets.get(i).getName(), ((Dog)pets.get(i)).fetch());
		    }
		scanner.close();
	}

}
}
