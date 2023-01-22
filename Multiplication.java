package P.Practice;

public class Multiplication
{
    int x;
    int y;

    void mul()
    {
        System.out.println(x*y);
    }

    public static void main(String[] args)
    {
        Multiplication m1= new Multiplication();
        m1.x=30;
        m1.y=40;
        m1.mul();

    }
}
