class p
{
public static void main(String ar[])
{
int i,j,f,n=100;
for(i=0;i<n;i++)
{
	f=0;
	for(j=2;j<i;j++)
	{
	  if(i%j==0)
	  {
	   f=1;
	  }
	}
	if(f==0)
	{
	System.out.println(i+"is prime");
	}
	/*else
	{
	System.out.println(i+"not prime");
	}*/
}
}
}
    