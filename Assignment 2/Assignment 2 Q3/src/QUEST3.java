import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QUEST3{
    public static void main(String[] args) {

        LocalDate today=LocalDate.now();
        System.out.println("THE CURRENT FORMAT OF DATE IS GIVEN AS : ");
        System.out.println(today);
        System.out.println("THE UPDATED FORMAT IS :");
        String newDate= today.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println(newDate);


    }
}