//EXAMPLE 1
/*class test
{
int a;
void display()
{
System.out.println(a);
}
test()
{
System.out.println("hello");
System.out.println(a);
}
}
class t_p
{
public static void main(String ar[])
{
test ob1=new test();
ob1.a=10;
test ob2=ob1;
ob2.display();
ob2.a=20;
ob1.display();
ob2.display();
ob1.a=40;
ob2.display();
}
}*/

//EXAMPLE 2
/*class test
{
int a;
void display()
{
System.out.println(a);
}
test()
{
System.out.println("hello");
System.out.println(a);
}
}
class t_p
{
public static void main(String ar[])
{
test ob1=new test();
ob1.a=10;
test ob2=new test();
ob2.display();
ob2.a=20;
ob1.display();
ob2.display();
ob1.a=40;
ob2.display();
}
}*/

//EXAMPLE 3
class test
{
int a;
void display()
{
System.out.println(a);
}
test()
{
System.out.println("hello");
System.out.println(a);
}
}
class t_p
{
public static void main(String ar[])
{
test ob1=new test();
ob1.a=10;
test ob2=ob1;
ob2.display();
ob1=null;//null means no link to object from exception
ob2.a=50;
ob2.display();
ob1.display();

}
}