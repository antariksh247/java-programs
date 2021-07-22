/*
Strings

*/

class first
{


void fun()
{
String c ="ANTARIKSH LABADE";  // simple string assign.
System.out.println(c);
}

void add()  // combine 2 string  
{
String s = "hello";
String s1 = "Antariksh";
String a=s+s1;                  // method 1 add string
System.out.println(a);
String m= a +" labade";         // method 2
System.out.println(m);

String b = s.concat(s1) + "hi";  // method 3 concat function
System.out.println(b);
}



public static void main(String arg[])
{
first f1 = new first();
 f1.fun();
 f1.add();
 String ob = new String ("hello");    // 2nd method to write string
 System.out.println(ob);
 
}
}
