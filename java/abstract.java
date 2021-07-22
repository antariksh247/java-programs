abstract class parent
{
abstract void fun1(int x);
public void fun2()
{
System.out.println("abstract class  normal fun1(),0 paramter");
}

}
class child extends parent
{
public void fun2()
{
System.out.println("normal  class fun1(),0 paramter");
}
void fun1(int x)
{
System.out.println("abstract class fun1(),1 paramter");
}
public static void main(String arg[])
{
child ob=new child();
ob.fun1(10);
ob.fun2();
child1 ob1 = new child1();
ob1.fun3(10);
ob1.fun4();
}
}


abstract class parent1
{
abstract void fun3(int x,int y);
abstract void fun4();
}
class child1 extends parent1
{
void fun3(int x,int y)
{
System.out.println("abstract child1  class fun3(), 2 int paramter");
}
void fun3(int x)
{
System.out.println("abstract child1  class fun3(),1int paramter");
}
void fun4()
{
System.out.println("abstract child1  class fun4(),0int paramter");
}
}



