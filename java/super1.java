/*
super keyword call parent class method
*/

class first
{
void show()
{
System.out.println("parent class");
}
}
class second extends first
{
void show()
{
System.out.println("child class");
}

void msg()
{
show();
super.show();
}

public static void main (String arg[])
{
second s1 = new second();
s1.msg();
}
}
