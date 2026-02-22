package employee;
public class Employee {
String name;
int id;
double salary;
Employee(String name,int id,double salary)
{
    this.name=name;
    this.id=id;
    this.salary=salary;
}
void display()
{
    System.out.println("Employee details is:"+"\nName of employee = " +name +"\nEmployee id is=" +id +"\nEmployee salary is=" +salary);
}
    public static void main(String[] args) {
        Employee em=new Employee("Sinchana",104, 459000);
        Employee e=new Employee("Spanduuuu",105, 45900);
        em.display();
        e.display();
    }
}
