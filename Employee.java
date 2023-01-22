package P.Practice;

public class Employee
{
    int e_id;
    String e_name;
    int e_salary;

     void display()
     {
         System.out.println(e_id);
         System.out.println(e_name);
         System.out.println(e_salary);
     }

    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.e_id = 101;
        emp.e_name = "Rajiv";
        emp.e_salary = 40000;
        emp.display();
    }

    }

