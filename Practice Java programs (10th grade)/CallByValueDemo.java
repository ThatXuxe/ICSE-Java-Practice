class Student
{
    String name;
    int rollno;
 
    Student()
    {
        name = null;
        rollno = 0;
    }
 
    Student (String name, int rollno)
    {
        this.name = name;
        this.rollno = rollno;
    }
}
 
public class CallByValueDemo
{
    public static void main(String[] args)
    {
        Student s1 = new Student("Garvita", 10);
        Student s2 = new Student("Anushka", 11);
 
        System.out.println("s1 - Name: " + s1.name + "\t" + "Roll No: " + s1.rollno);
        System.out.println("s2 - Name: " + s2.name + "\t" + "Roll No: " + s2.rollno);
        System.out.println(); //inserting new line
 
 
        /* swap (s1, s2) would not be able to swap 
         * objects s1, and s2 because in Java, parameters 
         * are passed by value to the function.		
         */ 
        swap (s1, s2);
 
        System.out.println(); //inserting new line
        System.out.println("s1 - Name: " + s1.name + "\t" + "Roll No: " + s1.rollno);
        System.out.println("s2 - Name: " + s2.name + "\t" + "Roll No: " + s2.rollno);
    }
 
    static void swap (Student x1, Student x2)
    { 
        /* objects x1, and x2 are swapped but 
         * they will have no impact on actual 
         * parameters passed to this function.
         * Therefore, x1, and x2 will be swapped 
         * but not s1, and s2 that are actual parameters
         * passed to this function.
         */ 
        Student temp = x1;
        x1 = x2;
        x2 = temp;
 
        //Print swapped content of x1, x2
        System.out.println("From swap method x1 - Name: " + x1.name + "\t" + "Roll No: " + x1.rollno);
        System.out.println("From swap method x2 - Name: " + x2.name + "\t" + "Roll No: " + x2.rollno);
    }
}