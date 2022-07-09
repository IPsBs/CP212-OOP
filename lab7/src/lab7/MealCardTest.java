package lab7;

public class MealCardTest {

	public static void main(String[] args) {
		
		// Create 3 students
		Student alice = new Student(1,"Alice", "Com-Sci");
		Student bob = new Student(2,"Bob", "Stat");
		Student cathy = new Student (3, "Cathy");
		
		// Create 3 meal cards
		MealCard aliceCard = new MealCard(alice, 500);
		MealCard bobCard = new MealCard(bob, 600);
		MealCard cathyCard = new MealCard(cathy);
		
		// Purchase an item without checking balance
		System.out.println(alice.getName() + " has " + aliceCard.getBalance() + " points in her account.");
		System.out.println(alice.getName() + " is buying an item worth " + 450+ " points.");
		aliceCard.purchaseItem(450);
		System.out.println("Now " + alice.getName() + " has " + aliceCard.getBalance() + " points in her account.");
	
		// Purchase an item with checking balance
		System.out.println(bob.getName() + " has " + bobCard.getBalance() + " points in his account." );
		System.out.println(bob.getName() + " is buying an item worth " + 700 + " points.");
		if (!bobCard.purchaseItem(700)) {
			System.out.println(bob.getName() + ", you have only " + 
					bobCard.getBalance() + " points. You need to add more money so that you can buy this item." );
		}
		else 
			System.out.println(bob.getName() + " has " + bobCard.getBalance() + " points in his account.");
		// Purchase points
		System.out.println(cathy.getName() + " has " + cathyCard.getBalance() + " points in her account.");
		cathyCard.purchasePoints(500);
		System.out.println("After buying more points...");
		System.out.println(cathy.getName() + " has " + cathyCard.getBalance() + " points in her account.");
		
	}
}
