package P.Practice;

public class Addition
{
    int a;
    int b;

    void add()
    {
        System.out.println(a+b);
    }

    public static void main(String[] args)
    {
        Addition a1=new Addition();
        a1.a=100;
        a1.b=200;
        a1.add();


    }
}
