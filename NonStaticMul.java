package P.Practice;

public class NonStaticMul
{
    void mul()
    {
        int d=1000;
        int e=800;
        System.out.println(d*e);
    }
    void show()
    {
        System.out.println("Multiplication");
    }

    public static void main(String[] args)
    {
        NonStaticMul n1=new NonStaticMul();
        n1.show();
        n1.mul();

    }
}
