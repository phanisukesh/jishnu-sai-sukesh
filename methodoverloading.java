class geometry
{
int l,w;
double b,h;
float r;
void area(float x)
{
r=x;
System.out.println(Math.PI*r*r);
}
void area(int a,int b)
{
l=a;
w=b;
System.out.println(l*w);
}
void area(double x,double y)
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
geometry ob=new geometry();
ob.area(10,20);
ob.area(10.5f);
ob.area(2.5,3.5);
}
}