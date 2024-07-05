import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
    Scanner scanner = new Scanner(System.in);
        int numOfStocks = scanner.nextInt();
        int k = scanner.nextInt();
        int[] stockPrices = new int[numOfStocks];
        for (int i = 0; i < numOfStocks; i++) {
            stockPrices[i] = scanner.nextInt();
        }
        Arrays.sort(stockPrices);
        System.out.println(stockPrices[k - 1]);
    }
}
        
        
        
