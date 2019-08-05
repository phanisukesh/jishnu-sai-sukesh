class area
{
int l,w;
double b,h;
double r;
area(double x)
{
r=x;
System.out.println(Math.PI*r*r);
}
area(int a,int b)
{
l=a;
w=b;
System.out.println(l*w);
}
area(double x,double y)
{
b=x;
h=y;
System.out.println(0.5*b*h);
}
}
class test
{
public static void main(String ar[])
{
area circle=new area(10.5);
area rectangle=new area(10,20);
area triangle=new area(3.5,4.5);
}
}