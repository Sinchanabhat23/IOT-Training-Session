package arrays;
class Student{
    String name;
    int USN;
}
class Intern {
    String name;
    int id;
    public Intern(String name, int id) {
        this.name = name;
        this.id = id;
    }
}
public class E7 {
    public static void main(String[] args) {
        Student[] students =new Student[3];
        students[0]=new Student();
        students[0].name="Rahul";
        students[0].USN=101;
        System.out.println(students[0].name+" "+students[0].USN);
        Intern[] interns=new Intern[]{
                new Intern("Sinchana",104),
                new Intern("Tejuu",115),
                new Intern("Pavanaaaaaaaaaaaaaaaaaaaaaa",71)
        };
        for(Intern i:interns){
            System.out.println(i.name+" "+i.id);
        }
        for(Student s:students){
            System.out.println(s.name+" "+s.USN);
        }
    }
}

