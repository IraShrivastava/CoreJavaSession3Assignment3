package assignment3;
class Parent
{
    public Parent()
    {
    	System.out.println("Parent class no-args constructor called");
    }
    public Parent(String name)
    {
    	this();		//this will call the Parent class no argument constructor 
        System.out.println("Parent class Parameterized constructor called by "+name);
    }
}
public class Assignment3_3 extends Parent {

	public Assignment3_3()
    {
        this("JIP");	//invokes child class constructor with argument
        System.out.println("Child class no-args constructor called");
    }
    public Assignment3_3(String name)
    {
        super("JIP");	//calls argument constructor of super class
        System.out.println("Child class Parameterized constructor called by "+name);
    }
    public static void main(String args[])
    {
    	Assignment3_3 c = new Assignment3_3();	//invokes Child class no argument constructor
    }

}