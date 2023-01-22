package P.Practice;

public class Student
{
    int stud_id;
    String stud_name;
    int stud_percentage;

    void show()
    {
        System.out.println(stud_id);
        System.out.println(stud_name);
        System.out.println(stud_percentage);

    }

    public static void main(String[] args)
    {
        Student s=new Student();
        s.stud_id=111;
        s.stud_name="Vihaan";
        s.stud_percentage= 95;
        s.show();



    }
}
