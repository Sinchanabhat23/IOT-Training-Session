package student;
public class Student {
    String name;
    int age;
    Student(String n, int a)
    {
        name=n;
        age=a;
    }
    void display()
    {
        System.out.println("Name of a student is "+name+"\nAge of a student is " +age);
    }
    public static void main(String[] args) {
     Student s=new Student("Sinchana",22);
     s.display();
    }
}
