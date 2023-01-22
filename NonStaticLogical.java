package P.Practice;

public class NonStaticLogical
{
    void logic()
    {
        int K=100;
        int J=50;
        System.out.println(K>J && K<J);
        System.out.println(K<J || K>J);
        System.out.println(!(!(K>J || K<J)));
        System.out.println(!(!(K>J)));
    }
    void show()
    {
        System.out.println("Logical Operators");
    }

    public static void main(String[] args)
    {
        NonStaticLogical none=new NonStaticLogical();
                none.show();
                none.logic();
    }
}
