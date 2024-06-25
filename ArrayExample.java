import java.util.*;
public class ArrayExample {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int []a=new int[n];
for(int i=0;i<n;i++) {
a[i]=sc.nextInt();
}
int temp=a[n-1];
for(int j=n-2;j>=0;j--) {
a[j+1]=a[j];
}
a[0]=temp;
for(int i=0;i<n;i++) {
System.out.println(a[i]+" ");
}
}
}
