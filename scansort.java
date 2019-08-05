import java.util.Scanner;
class ar
{
public static void main(String ar[])
{
int i,j,n,temp;
Scanner scan=new Scanner(System.in);
n=Integer.parseInt(ar[0]);
int a[]=new int[100];
for(i=0;i<n;i++)
{
a[i]=scan.nextInt();
}
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
for(i=0;i<n;i++)
{
System.out.println("sorted array is");
System.out.println(a[i]);
}
}
}


 