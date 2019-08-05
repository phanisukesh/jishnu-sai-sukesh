/*class test
{
int a;
test()//default
{
System.out.println(a);
}
test(int x)//parametrized
{
a=x;
System.out.println(a);
}
void display()
{
System.out.println(a);
}
}
class test_p
{
public static void main(String ar[])
{
test ob=new test();//default 
test ob2=new test(5);//parametrized
ob.a=20;
ob.display();
ob2.a=30;
ob2.display();
}
}*/
class student
{
int id;
String name;
student()
{
System.out.println(id);
System.out.println(name);
}
student(int x,String y)
{
id=x;
name=y;
}
void display()
{
System.out.println(id);
System.out.println(name);
}
public static void main(String ar[])
{
student ob=new student();
ob.id=1;
ob.name="sukesh";
ob.display();
student ob2=new student(2,"sukesh");
student ob3=new student(3,"sai");
ob2.display();
ob3.display();
}
}

