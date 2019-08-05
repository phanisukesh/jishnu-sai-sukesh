import java.util.Scanner;
class rev
{
public static void main(String ar[])
{
System.out.println("enter string");
Scanner scan=new Scanner(System.in);
String s=scan.nextLine();
String reverse="";
int i;
for(i=s.length()-1;i>=0;i--)
{
reverse=reverse+s.charAt(i);
}
System.out.println("reversed is");
System.out.println(reverse);
}
}