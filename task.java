import java.util.Scanner;
class n
{
public static void main(String ar[])
{
Scanner scan=new Scanner(System.in);
String n=scan.nextLine();
int s2=n.length();
int s1=n.indexOf('.');
int s3=s2-s1-1;
System.out.println("no of elements after . is"+s3);
System.out.println("no of elements before . is"+s1);
System.out.println(s2);
System.out.println(s1);
}
}