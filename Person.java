package P.Practice;

public class Person
{
    int age;
    String name;
    char sex;

    void read()
    {
        System.out.println(age+ " "+name +" "+sex);
    }

    public static void main(String[] args)
    {
        Person p= new Person();
        p.age=35;
        p.name="Kartik";
        p.sex='M';
        p.read();

    }
}
