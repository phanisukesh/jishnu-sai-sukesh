import java.util.*;
class wrapper
{
public static void main(String ar[])
{
//(auto boxing)
int ob=new Integer(10);
int b=ob;
System.out.println(b);
//primitive to object
int a=100;
Integer obj=a;
System.out.println(obj);
//previous jdks
int ab=20;
int ob1=Integer.valueOf(ab);
System.out.println(ob1);

}
}