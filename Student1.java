package P.Practice;

public class Student1
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
            Student1 s=new Student1(); //First student
            s.stud_id=111;
            s.stud_name="Vihaan";
            s.stud_percentage= 95;
            s.show();

            Student1 s1=new Student1(); //second student
            s1.stud_id=222;
            s1.stud_name="Kavya";
            s1.stud_percentage=90;
            s1.show();



        }
    }


