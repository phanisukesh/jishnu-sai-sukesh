class test
{
int a;
test()
{
a=10;
System.out.println(a);
}
void display(int a)
{
this.a=40;
System.out.println(a);
System.out.println(this.a);
}
}
class test_p
{
public static void main(String ar[])
{
test ob=new test();
ob.a=10;
ob.display(20);
}
}
