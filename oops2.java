class shape //hierarchial inheritance
{
    public void area()
    {
        System.out.println("displays area");
    }
}
class triangle extends shape
{
    public void area(int l,int h)
    {
        System.out.println(1/2*l*h);
    }
}
class cricle extends shape 
{
   public void area(int r)
   {
       System.out.println((3.14)*r*r);//overloading method
       
   }
}
public class oops2
{
    public static void main(String[] args)
    {
        cricle t=new cricle();
        t.area(6);
    }
}