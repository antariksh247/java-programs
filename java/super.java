/*
super keyword
-> use to access parent class member in base class
*/
class first
{
int b;
}

class second extends first
{
int b;
void show()
{
int a =20;
super.b=25;
System.out.println(+super.b);
System.out.println(+a);
}
public static void main(String arg[])
{
second s1 = new second();
s1.show();
}
}
