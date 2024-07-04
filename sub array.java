import java.util.*;
public class SubArray
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int[] a={2,8,9,6,5};
int n=a.length;
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
for(int k=i;k<=j;k++)
{
System.out.print(a[k]+" ");
}
System.out.println();
}
}
}
}

