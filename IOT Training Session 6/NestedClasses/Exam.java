package NestedClasses;
import java.time.LocalDate;
public class Exam {
    void evaluate(int marks)
    {
        class GradeCalculator{
            String calculate() {
                if (marks >= 75) return "Distinction";
                else if (marks >= 60) return "First Class";
                else return "Pass";
               }
            }
            GradeCalculator gc = new GradeCalculator();
        System.out.println(gc.calculate());
    }
    void displayExamDate(){
        LocalDate date=LocalDate.now().plusDays( 5);
        System.out.println("The exam date is: "+date);
    }
    public static void main(String[] args) {
        Exam exam = new Exam();
        exam.evaluate(77);
        exam.evaluate(34);
        exam.displayExamDate();
    }
}
/* POINTS TO REMEMBER
Grade logic is scoped to the "evaluate" method
It avoids polluting the class with helper methods
it helps in designing the code base in a cleaner way
 */