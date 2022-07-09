package lab7;

public class Student {
	//Data members
	private int id;
	private String name;
	private String major;
	//Constructor
	public Student(int id, String name, String major) 
	{ 
		this.id = id;
		this.name = name;
		this.major = major;
	}
	public Student(int id, String name)
	{ 
		this.id = id;
		this.name = name;
		this.major = "None major";
		}
	
//Accessors
public int getID()
{ 
	return id;
	}
public String getName()
{
	return name;
}
public String getMajor()
{ 
	return major;
}
//Mutators
public void setID(int id)
{
	this.id = id;
}
public void setName(String name)
{
	this.name = name;
}
public void setMajor(String major)
{ 
	this.major = major;
}
}
