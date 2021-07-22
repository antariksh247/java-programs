
//final keyword 
class first
{
 final int a=10;

void show()
{
//a=20;
//System.out.print(+a);
}
public static void main(String arg[])
{
first f1 = new first();
//f1.show();
second s1 = new second();
second s2 = new second();

s1.show1();
s2.show1();
}
}

//static keyword

class second
{
int a=20;
static int b=20;
void show1()
{
a=a+10;
b=b+10;
System.out.println(+a);
System.out.println(+b);
}

}


