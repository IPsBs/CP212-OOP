package lab7;

class MealCard {
	   // data members
	   private final int DEFAULT_POINTS = 100;
	   private int balance;
	   private Student student;
	   // Constructors
	   public MealCard(Student student) 
	   {   
		   this.student = student;
		   balance = DEFAULT_POINTS;
	   }
	   public MealCard(Student student, int points) 
	   {   
		   this.student = student;
		   this.balance = points;
	   }
	   // Methods
	   public boolean purchaseItem(int points) 
	   {   
		   if (points > balance)
			   return false;
		   balance -= points;
		   return true;
	   }
	    public void purchasePoints(int points) 
	   {   
	    	balance += points;
	   }
	   public int getBalance()
	   {   
		   return balance;
	   }
	}
