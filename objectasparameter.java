class tes
{
int a,b;
tes()
{
a=10;
b=20;
}
void display(tes ob)
{
a=ob.a+10;
b=ob.b+30;
System.out.println(a+" "+b);
}
public static void main(String ar[])
{
tes ob1=new tes();
tes ob2=new tes();
ob1.display(ob1);
System.out.println(ob1.a+" "+ob1.b);
}
}