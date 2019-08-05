import java.util.Scanner;
//using recursion
class fact
{
 static int factorial(int n)
{
if (n == 0)    
    return 1;    
  else    
    return(n * factorial(n-1));    
 }
public static void main(String ar[])
{
int i,facto=1; 
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
 facto = factorial(n);   
  System.out.println(facto);    
 }  
}     
/*class fact
{
public static void main(String ar[])
{
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int sum=1;
while(n!=0)
{
sum=sum*n;
n--;
}
System.out.println(sum);
}
}*/
