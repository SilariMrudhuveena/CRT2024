import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
    
        
        
    }
}
