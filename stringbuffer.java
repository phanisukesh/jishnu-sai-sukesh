class stbuffer
{
public static void main(String ar[])
{
String s="jishnu sai sukesh";
StringBuffer o=new StringBuffer(s);
System.out.println(o.capacity());
System.out.println(o.append("puvvada"));
System.out.println(o.insert(0,"sri"));
System.out.println(o.replace(0,3,"phani"));
System.out.println(o.delete(1,4));
System.out.println(o.reverse());
System.out.println(o.substring(4));
}
}



