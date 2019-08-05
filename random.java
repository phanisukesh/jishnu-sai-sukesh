import java.util.*;
class random
{
public static void main(String ar[])
{
Random a=new Random(2);
int n1=a.nextInt(1);
System.out.println(n1);
double n2=a.nextDouble();
System.out.println(n2);
//to obtain same random values
Random q=new Random(100);
Random w=new Random(100);
int n3=q.nextInt();
int n4=w.nextInt();
System.out.println(n3);
System.out.println(n4);
//using math function
double max=10;
double min=5;
System.out.println(Math.random()*(max-min)+1))+min;
System.out.println(Math.random());
}
}
