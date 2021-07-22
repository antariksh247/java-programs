
//main class 
class parent
{

int i=15,j=15;
public void go()
{
int k =i+j;
System.out.print(+ k);
}
//int l=10,m=10;
}
class child extends parent
{

public static void main(String arg[])
{
parent ob = new parent();
ob.go();
}
}

