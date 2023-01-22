package P.Practice;

public class Subtraction
{
    int d;
    int e;

    void sub()
    {
        System.out.println(d-e);
    }

    public static void main(String[] args)
    {
        Subtraction sub=new Subtraction();
        sub.d=4000;
        sub.e=300;
        sub.sub();

    }
}
