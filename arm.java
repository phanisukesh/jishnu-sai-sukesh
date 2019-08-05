import java.util.Scanner;
class arm
{
public static void main(String ar[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int i,sum=0,rem,a=n;
while(n!=0)
{
rem=n%10;
sum=sum+(rem*rem*rem);
n=n/10;
}
if(sum==a)
{
System.out.println("it is armstrong");
}
else
{
System.out.println("it is not armstrong");
}
}
}