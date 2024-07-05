public class StringExample
{
public static void main(String args[])
{
String s1="12asddRTTRX2%5#";
int uppercount=0,lowercount=0,digitcount=0,symbolcount=0;

for(int i=0;i<s1.length();i++)
{
char ch=s1.charAt(i);
if (ch>='A'&&ch<='Z')
uppercount++;
else if(ch>='a'&&ch<='z')

lowercount++;
else if(ch>='0'&&ch<='9')

    digitcount++;
    else
    symbolcount++;
}
System.out.println(uppercount+" "+lowercount+" "+digitcount+" "+symbolcount);
}
}
