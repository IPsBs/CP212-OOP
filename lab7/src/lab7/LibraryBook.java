package lab7;

import java.util.*;
class  LibraryBook {
	private static final double CHARGE_PER_DAY  = 0.50;
	private static final double MAX_CHARGE = 50.00;
	private static final String DEFAULT_TITLE = "Title unknown";

	private GregorianCalendar dueDate; 
	private String title;
	private double chargePerDay;
    private double maximumCharge;
	public LibraryBook(GregorianCalendar dueDate) {
		this(dueDate, CHARGE_PER_DAY);
	}
	public LibraryBook(GregorianCalendar dueDate, double chargePerDay) {
		this(dueDate, chargePerDay, MAX_CHARGE);
	}
	public LibraryBook(GregorianCalendar dueDate, double chargePerDay, double maximumCharge) {
		this(dueDate, chargePerDay, maximumCharge,  DEFAULT_TITLE);
	}
	public LibraryBook(GregorianCalendar dueDate, double chargePerDay, double maximumCharge, String title) {
		setDueDate(dueDate);
		setChargePerDay(chargePerDay);
		setMaximumCharge(maximumCharge);
		setTitle(title);
	}

public double getChargePerDay()
{
	return chargePerDay;
}

public GregorianCalendar getDueDate(){
return dueDate;
}

public double getMaxCharge()
{
	return maximumCharge;
}

public String getTitle() {
	return title;
}

public void setChargePerDay(double charge) {
	this.chargePerDay = charge;
}

public void setDueDate(GregorianCalendar date) {
	this.dueDate = date;
}

public void setMaximumCharge(double charge) {
	this.maximumCharge = charge;
}

public void setTitle(String title) {
	this.title = title;
}

   public String toString() {
		return String.format("%-30s  $%5.2f  $%7.2f  %4$tm/%4$td/%4$ty",title,chargePerDay,maximumCharge,dueDate);
			
   }
}
