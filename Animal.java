package P.Practice;

public class Animal
{
    int age;
    String name;
     void Obj(String n, int a)
     {
         a = age;
         n = name;
     }
         void Display()
         {
             System.out.println(age+ " "+name);
         }

    public static void main(String[] args)
    {
        Animal a1=new Animal();
        a1.age=5;
        a1.name="Tommy";
        a1.Display();

    }
     }

