import java.util.*;
public class SubArray
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int[] a={2,8,9,6,5};
int n=a.length;
int min=Integer.MAX_VALUE;
for(int i=0;i<n;i++)
{
for(int j=i;j<n;j++)
{
int sum=0;
for(int k=i;k<=j;k++)
{
sum=sum+a[k];
System.out.print(a[k]+" ");
}
System.out.println("="+sum);
if(min>sum)
min=sum;
}
}
System.out.println(min);
}
}

