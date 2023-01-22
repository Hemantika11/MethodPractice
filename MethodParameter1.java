package P.Practice;

public class MethodParameter1
{
    void method (int a,int b)
    {
        System.out.println(a*b);
    }
    void show()
    {
        System.out.println("Enter the value: ");
    }
    public static void main(String[] args)
    {
        MethodParameter1 me= new MethodParameter1();
        me.show();
        me.method(20,40);

    }
}
