package P.Practice;

public class NonStaticMethod
{
    void method() //In NonstaticMethod we need to create object in main method
    {
        System.out.println("This is NonStaticMethod");
    }
    public static void main(String[] args)
    {
        NonStaticMethod non= new NonStaticMethod();
        non.method();
    }
}
