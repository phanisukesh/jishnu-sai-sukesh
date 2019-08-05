import java.util.*;
/*class r
{
int a;
public static void main(String ar[])
{
r ob=new r();
Scanner scan=new Scanner(System.in);
ob.a=scan.nextInt();
System.out.println(ob.a);
}
}*/
class test
{
int a;
void read()
{
System.out.println("enter no");
Scanner scan=new Scanner(System.in);
a=scan.nextInt();
}
void display()
{
System.out.println(a);
}
public static void main(String ar[])
{
test ob=new test();
ob.read();
ob.display();
ob.a=5;
ob.display();
}
}