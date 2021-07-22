  
  // overloading 
  /* check parameter
  same function diff parameter*/
  class poly
{
  public void fun1(){
    System.out.println("No Parametr");
}
   void fun1(int i,int j)
  {
      System.out.println("2 integer Parametr");
  }
     void fun1(int i,char j)
    {
          System.out.println("1 integer 1 char Parametr");
     }
     
       void fun1(float j)
    {
          System.out.println("1 float Parametr");
          
     }
     
     public static void main(String arg[])
      {
      poly p = new poly();
      p.fun1();
      p.fun1(10,20);
     p.fun1(10,'a');
     p.fun1(12);
      }
   }
