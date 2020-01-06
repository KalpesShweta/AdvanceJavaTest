package Test;


import java.util.Vector;

public class Program6_Vector {

public static void main(String[] args) {

Vector < String> vec=new Vector < String>();
vec.add("t");
vec.add("e");
vec.add("k");
vec.add("a");
vec.add("r");
vec.add("c");
vec.add("h");

System.out.println("Given Vector is " +vec);

for(int i=5;i>0;i--) {     //N=5
vec.insertElementAt("Z", 3);
}
System.out.println("After Inserting character, new vector is " +vec);

for(int i=5;i>0;i--) {
vec.removeElementAt(6);
}
System.out.println("After deleting character new vector is " +vec);


}

}
