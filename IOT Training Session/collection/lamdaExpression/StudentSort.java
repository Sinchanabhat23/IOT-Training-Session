package DSA.collection.lamdaExpression;

import java.util.ArrayList;
import java.util.Collections;

class Student{
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class StudentSort {
    public static void main(String[] args) {
    ArrayList<Student>list=new ArrayList<>();
    list.add(new Student(108,"Rahul"));
    list.add(new Student(100,"Amit"));
    list.add(new Student(145,"Raam"));
    list.add(new Student(123,"Shyam"));
    for(Student s:list) {
        System.out.println(s.id + " " + s.name);
       }
    // Ascending order based on id
        System.out.println("Sorted List is:");
    Collections.sort(list,(s1, s2)->s1.id-s2.id); // Ascending order
    for(Student s:list) {
        System.out.println(s.id + " " + s.name);
       }
    }
}
