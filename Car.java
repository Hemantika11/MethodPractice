package P.Practice;

public class Car
{
    void Star()
    {
        System.out.println("Start engine=========");
}
void drive()
{
    System.out.println("Drive car==========");
}
    void stop()
    {
        System.out.println("Stop car==========");
    }

    public static void main(String[] args)
    {
        Car ca=new Car();
        ca.Star();
        ca.drive();
        ca.stop();
    }


}
