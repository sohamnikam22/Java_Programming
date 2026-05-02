final class Demo 
{
   public void fun ()
   {

    System.out.println("Inside demo fun");
   }
   public void gun ()
   {

    System.out.println("Inside demo gun");
   }
}

class Hello extends Demo            // Error
{
    public void gun()
    {
        System.out.println("Inside hello gun");
    }

}


class final_class
{

    public static void main(String A[])
    {
        Demo dobj = new Demo();   // Allowed

         Hello hobj = new Hello();
    }
}