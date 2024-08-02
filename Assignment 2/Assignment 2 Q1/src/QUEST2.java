import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class QUEST2{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean exit=false;
        while(!exit) {

            System.out.println("PLEASE ENTER YOUR UMT EMAIL : ");
            String s=input.nextLine() ;

            Pattern pattern = Pattern.compile("[fFsS]\\d{10}@umt\\.edu\\.pk");
            Pattern pattern1 =  Pattern.compile("^[a-z]+[a-z0-9]+@gmail\\.com$");


            Pattern pattern2 = Pattern.compile("^[a-z]+\\.[a-z0-9]+@gmail\\.com$");



            Matcher matcher = pattern.matcher(s);
            Matcher matcher1 = pattern1.matcher(s);
            Matcher matcher2 = pattern2.matcher(s);
            if (matcher.matches()|| matcher1.matches()||matcher2.matches()){
            System.out.println("YOU HAVE ENTERED THE CORRECT EMAIL");
            exit=true;}
            else {
                System.out.println("YOU HAVE ENTERED WRONG EMAIL TRY AGAIN: ");
            }


    }
        input.close();
}
}