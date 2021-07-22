/* overriding same method in child and parent class
only child method can modify
 */
class Parent
{
int i=10,j=15;
int  fun1()
{
return i+j;
}


}
class Child extends parent
{
int fun1()

{
return i;
}
public static void main(String antariksh[])
   {
    child ob = new child();
    System.out.print(ob.fun1());
}
}

