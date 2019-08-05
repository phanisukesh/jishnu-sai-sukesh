class st
{
public static void main(String ar[])
{
String s1="jishnu";
String s2="sukesh";
String s4="sasisa";
//concatenation

String s3=s1.concat(s2);
System.out.println(s3);
//length

int n=s1.length();
System.out.println(n);
//specific character

char a=s1.charAt(5);
System.out.println(a);
//compare to

int b=s1.compareTo(s2);
System.out.println(b);
//compare to ignore case

int c=s1.compareToIgnoreCase(s2);
System.out.println(c);
//boolean equals

boolean d=s1.equals(s2);
System.out.println(d);
//boolean equals to ignore case

boolean e=s1.equalsIgnoreCase(s2);
System.out.println(e);
//Starts with

boolean f=s1.startsWith("j");
System.out.println(f);
//ends with

boolean g=s1.endsWith("nu");
System.out.println(g);
//substing

String h=s1.substring(2,4);
String i=s1.substring(2);
System.out.println(h);
System.out.println(i);
//repalce

String j=s1.replace("j","g");
System.out.println(j);
String k=s4.replace("sa","la");
System.out.println(k);
String l=s1.replaceFirst("ji","go");
System.out.println(l);
String m=s4.replaceAll("sa","la");
System.out.println(m);

}
}