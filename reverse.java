import java.util.Scanner;
class rev
{
public static void main(String ar[])
{
int rem=0,sum=0;
int n;
Scanner scan=new Scanner(System.in);
System.out.println("enter number");
n=scan.nextInt();
while(n!=0)
{
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
System.out.println(sum);
}
}