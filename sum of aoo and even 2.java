import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int esum=0;
        int osum=0;
       for(int i=0;i<n;i++)
       {
           a[i]=sc.nextInt();
       }
        for(int i=0;i<n;i++)
        {
         if(a[i]%2==0)
         {
        esum=esum+a[i];
         }
        else
        {
            osum=osum+a[i];
        }
        }
            System.out.println(osum);
            System.out.println(esum);
    }
}
