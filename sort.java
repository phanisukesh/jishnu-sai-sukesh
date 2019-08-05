class so
{
public static void main(String ar[])
{
int i,j,temp=0;
int a[]={15,56,89,45,12};
for(i=0;i<a.length;i++)
{
for(j=1;j<a.length;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}