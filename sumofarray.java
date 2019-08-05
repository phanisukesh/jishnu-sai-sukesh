class su
{
public static void main(String ar[])
{
int i,s=0,a[]={1,2,3,4,5};
for(int z:a)
{
System.out.println(z);
}
for(i=0;i<a.length;i++)
{
s=s+a[i];
}
System.out.println("sum is"+s);
}
}