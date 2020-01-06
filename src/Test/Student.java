package Test;

public class Student {
	 int regno; 
	    String name, address; 
	  
	    public Student() 
	    	{ 
	    		 
	    	} 

	    // Constructor 
	    public Student(int regno, String name
	                   ) 
	    { 
	       this.regno = regno; 
	        //this.name = name; 
	        //this.address = address; 
	    } 
	  
	    // Used to print student details in main() 
	    public String toString() 
	    { 
	        return this.regno + " "
	            + this.name;
	           // + " "+ this.address; 
	    } 
	} 

