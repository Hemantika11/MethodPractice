package P.Practice;

public class MethodParameter
{
    public static void Multiply(int x,int y) //Static method

    {
        System.out.println(x*y);
    }
    public static void show()
    {
        System.out.println("Enter the Value");
    }
    public static void main(String[] args)
    {
        show();
        Multiply(3,300);
        Multiply(400,5);
    }

}
