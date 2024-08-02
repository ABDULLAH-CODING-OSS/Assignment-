import java.util.Scanner;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QUEST6{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE BRACES  ");
        String str=input.nextLine();
        if( Pattern.compile("\\(\\)|\\(\\)\\{\\}\\[\\]|\\[\\{\\(\\)\\}\\]").matcher(str).matches()){

          System.out.println("valid");
      }
      else {
          System.out.println("not valid ");
      }

    }
}