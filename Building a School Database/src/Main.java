public class Main
{
    public static void main(String[] args)
    {

        Teacher a = new Teacher("Alex","Paul", "Math");
        Teacher b = new Teacher("Amir", "Black", "Science");
        Teacher c = new Teacher("Anthony", "Brown", "Science");
        Teacher d = new Teacher("Peter", "Gustanis", "Math");

        Student e = new Student("Marvin", "Chen", 5);
        Student f = new Student("Anthony", "Jordan", 6);
        Student g = new Student("Rudy", "Towns", 9);
        Student h = new Student("Nikola", "Murray", 7);
        Student i = new Student("Fred", "Rodman", 6);
        Student j = new Student("Liam", "Lynch", 6);
        Student k = new Student("Jayden", "Brewer", 6);
        Student l = new Student("Michael", "Chen", 7);
        Student m = new Student("Tom", "Potter", 5);
        Student n = new Student("Ronald", "Parker", 5);

        School school = new School("Handsworth", 48, "public");

        System.out.println("Teachers include:\n");

        school.addTeacher(a);
        school.addTeacher(b);
        school.addTeacher(c);
        school.addTeacher(d);
        school.printTeacher();

        System.out.println("\nStudents include:\n");

        school.addStudent(e);
        school.addStudent(f);
        school.addStudent(g);
        school.addStudent(h);
        school.addStudent(i);
        school.addStudent(j);
        school.addStudent(k);
        school.addStudent(l);
        school.addStudent(m);
        school.addStudent(n);
        school.printStudent();

        System.out.println("\n-Now after deleting some:\n");
        System.out.println("Teachers include:\n");

        school.deleteTeacher(a);
        school.printTeacher();

        System.out.println("\nStudents include:\n");

        school.deleteStudent(e);
        school.deleteStudent(f);
        school.printStudent();
    }
}
