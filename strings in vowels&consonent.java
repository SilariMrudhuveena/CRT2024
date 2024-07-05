public class StringExample
{
public static void main(String args[])
{
    String s="12asddEDSIe3&%";
int vowelcount=0,consonentcount=0;
for(int i=0;i<s.length();i++) {
  char ch=s.charAt(i);
if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z'){
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
vowelcount++;
else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
vowelcount++;
else
consonentcount++;
}
}
System.out.println(vowelcount+" "+consonentcount);
}
}
