package P.Practice;

public class EmployeeData
{
   public int id;
   public String name;
   private int salary;

   void show()
   {
       System.out.println(id+ " "+name+ " "+salary);
   }



    public static void main(String[] args)
    {
        EmployeeData e=new EmployeeData();
        e.id=1000;
        e.name="Hemantika";
        e.salary=50000;
        e.show();

    }

}
