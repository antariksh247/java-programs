/*
constructor
->avoid to get default value
->can make object of constructor
-> class ob = new class() // here class() is by default constructor of class object
-> class name and constructor name should same
-> o/p of given prg is " this is a constructor 10 "
*/
 class First
 {
 int a;
 First(int b)
 {
 System.out.println("this is a constructor");
 a=b;
 }
 public void display()
 {
  System.out.println(+ a);
 }
 public static void main(String arg[]){
    First ob = new First(20);
        ob.display();
  }

}
