import java.util.*;
//without specified delimeter
class stringtokenizer
{
public static void main(String ar[])
{
StringTokenizer s=new StringTokenizer("my name is sukesh"," ");
while(s.hasMoreTokens())
{
System.out.println(s.nextToken());
}
//with delimeter
StringTokenizer a=new StringTokenizer("my,name,is,sukesh",",");
while(a.hasMoreTokens())
{
System.out.println(a.nextToken());
}
//WITH TRUE
StringTokenizer b=new StringTokenizer("my,name,is,sukesh",",",true);
while(b.hasMoreTokens())
{
System.out.println(b.nextToken());
}
}
}