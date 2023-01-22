package P.Practice;

public class Employee1
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
        Employee1 emp = new Employee1();
        emp.e_id = 101;
        emp.e_name = "Rajiv";
        emp.e_salary = 40000;
        emp.display();

        Employee1 emp1=new Employee1();
        emp1.e_id=102;
        emp1.e_name ="Kalpesh";
        emp1.e_salary=80000;
        emp1.display();
    }

}



