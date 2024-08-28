import java.util.ArrayList;

public class School
{
    private String name;
    private int age;
    private String status;
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Teacher> teachers = new ArrayList<>();
    School(String name, int age, String status)
    {
        this.name = name;
        this.age = age;
        this.status = status;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }
    public void addTeacher(Teacher t)
    {
        teachers.add(t);
    }
    public void printTeacher()
    {
        for (int i = 0;i < teachers.size();i++)
        {
            System.out.println(teachers.get(i));
        }
    }
    public void addStudent(Student s)
    {
        students.add(s);
    }
    public void printStudent()
    {
        for (int i = 0;i < students.size();i++)
        {
            System.out.println(students.get(i));
        }
    }
    public void deleteTeacher(Teacher t)
    {
        teachers.remove(t);
    }
    public void deleteStudent(Student s)
    {
        students.remove(s);
    }
}
