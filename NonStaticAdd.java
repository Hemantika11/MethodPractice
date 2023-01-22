package P.Practice;

public class NonStaticAdd
{
    void add()
    {
        int a=30;
        int b=60;
        System.out.println(a+b);
    }
    void print()
    {
        System.out.println("Addition");
    }

    public static void main(String[] args)
    {
        NonStaticAdd non=new NonStaticAdd();
        non.print();
        non.add();


    }
}
