package Test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
 
public class Program4_SortArray 
{
    private static void Q4_sortArrayElementsByFrequency(int[] inputArray)
    {
        //Create LinkedHashMap with elements as keys and their occurrences as values
        // LinkedHashMap maintains insertion order of elements
         
        Map<Integer, Integer> elementCountMap = new LinkedHashMap<>();
         
        //Check presence of each element in elementCountMap 
         
        for (int i = 0; i < inputArray.length; i++) 
        {
            if (elementCountMap.containsKey(inputArray[i]))
            {
                //If element is present in elementCountMap, increment its value by 1
                 
                elementCountMap.put(inputArray[i], elementCountMap.get(inputArray[i])+1);
            }
            else
            {
                //If element is not present, insert this element with 1 as its value
                 
                elementCountMap.put(inputArray[i], 1);
            }
        }
         
        //Construct an ArrayList holding all Entry objects of elementCountMap
         
        ArrayList<Entry<Integer, Integer>> listOfEntry = new ArrayList<>(elementCountMap.entrySet());
         
        //Sort listOfEntry based on values
         
        Collections.sort(listOfEntry, new Comparator<Entry<Integer, Integer>>() 
                                        {
                                            @Override
                                            public int compare(Entry<Integer, Integer> o1, Entry<Integer, Integer> o2) 
                                            {
                                                return o2.getValue().compareTo(o1.getValue());
                                            }
                                        }
        );
         
        //Print sorted array elements in descending order of their frequency
         
        System.out.println("Input Array : "+Arrays.toString(inputArray));
         
        System.out.println("Sorted Array Elements In Descending Order Of Their Frequency :");
         
        System.out.print("[ ");
         
        for (Entry<Integer, Integer> entry : listOfEntry) 
        {
            int frequency = entry.getValue();
             
            while (frequency >= 1)
            {
                System.out.print(entry.getKey()+" ");
                 
                frequency--;
            }
        }
         
        System.out.print("]");
    }
     
    public static void main(String[] args) 
    {
        Q4_sortArrayElementsByFrequency(new int[] {2,5,3,8,7,2,5,2,3});
    }
}
