import java.util.*;
class emp
{
int eid;
String ename=new String();
int salary;
void read()
{
Scanner scan=new Scanner(System.in);
System.out.println("enter name");
ename=scan.nextLine();
System.out.println("enter id");
eid=scan.nextInt();
System.out.println("enter salary");
salary=scan.nextInt();
}
void display()
{
System.out.println(eid);
System.out.println(ename);
System.out.println(salary);
}
public static void main(String ar[])
{
emp ob=new emp();
ob.read();
ob.display();
ob.eid=2;
ob.display();
}
}