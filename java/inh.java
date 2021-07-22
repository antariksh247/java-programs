// parent access child
class parent extends child
{
int fun()
{
int k =i+j;
return k;
}

}
//main class 
class child 
{

int i=15,j=15;
int l=10,m=10;
}
// grandchild can access main child class
class grandchild extends child

{
int p=13,q=13;
int fun1()
{
int n=l+m;
return n;
}
}
// class grgrchild  can acces grandchild
class grgrchild extends grandchild
{
int fun2()
{
return p+q;
}
}
class three
{
public static void main(String arg[])
{
parent ob = new parent();
grandchild ob1 = new grandchild();
grgrchild ob2 = new grgrchild();
System.out.println(ob.fun());
System.out.println(ob1.fun1());
System.out.println(ob2.fun2());
}
}



