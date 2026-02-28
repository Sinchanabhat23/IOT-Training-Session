import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class WorkingWithDateAndTime{
public static void main(String[] args) {
    LocalDate date = LocalDate.now();
    System.out.println("Date is:"+date);
    LocalTime time = LocalTime.now();
    System.out.println("Time is:" + time);
    LocalDateTime dateTime = LocalDateTime.now();
    System.out.println("Date &  Time is:"+dateTime);
    /* Display the day of the month
    Display the day of year
    Display the week name,month number,month name
    E-Name of the day (Mon to sun)
    D-Day of the year(1-366)
    dd-Day of month(1-12)
    M-Month Number(1-12)
    MMM-month name(jan-dec)
     */
    DateTimeFormatter format=DateTimeFormatter.ofPattern("D, MMM dd yyyy");
    String formattedDate=date.format(format);
    System.out.println("Formatted date is:"+formattedDate);
  }
}
