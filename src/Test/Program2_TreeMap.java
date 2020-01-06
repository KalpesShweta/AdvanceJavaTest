package Test;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



class Student1 {
	int regno;
	String name, address;

	// Constructor
	public Student1(int regno, String name) {
		this.regno = regno;
		// this.name = name;
		// this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.regno + " " + this.name;
		// + " "+ this.address;
	}
}

public class Program2_TreeMap {

	public static void main(String[] args) {

		TreeMap<Student, Integer> tree_map = new TreeMap<Student, Integer>();

		// Mapping string values to int keys
		tree_map.put(new Student(111, "bbbb"), 2);
		tree_map.put(new Student(131, "aaaa"), 3);
		tree_map.put(new Student(121, "cccc"), 1);
		 // Displaying the TreeMap 
		 System.out.println("TreeMap: "
		                    + tree_map); 
	}
}
