//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class QUEST4{
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
        System.out.println("ENTER THHE DATE IN FORMAT OF YYYY-MM-dd");
        String str=input.nextLine();
        LocalDate date = LocalDate.parse(str);
       date= date.plusDays(30);
       date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY"));
        System.out.println(date.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));






    }
}