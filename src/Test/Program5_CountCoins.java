package Test;


public class Program5_CountCoins 
{ 
    // m is size of coins array (number of different coins) 
    static int minCoins(int coins[], int m, int V) 
    { 
       // base case 
       if (V == 0) return 0; 
       
       // Initialize result 
       int res = Integer.MAX_VALUE; 
       
       // Try every coin that has smaller value than V 
       for (int i=0; i<m; i++) 
       { 
         if (coins[i] <= V) 
         { 
             int sub_res = minCoins(coins, m, V-coins[i]); 
       
             // Check for INT_MAX to avoid overflow and see if 
             // result can minimized 
             if (sub_res != Integer.MAX_VALUE && sub_res + 1 < res) 
                res = sub_res + 1; 
         } 
       } 
       return res; 
    } 
    public static void main(String args[]) 
    { 
    	System.out.println("test");
       int coins[] =  {100,25,10,5,1}; 
       int m = coins.length; 
       int V = 288; 
      
       System.out.println( minCoins(coins, m, V) );
       //System.out.println("Minimum coins required is "+ minCoins(coins, m, V) ); 
    } 
}
