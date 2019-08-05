class max
{
public static void main(String ar[])
{
int a[]={1,2,3,4,5};
int i,min=5;
for(i=0;i<a.length;i++)
{
if(a[i]<min)
{
min=a[i];
}
}
System.out.print(min);
}
}