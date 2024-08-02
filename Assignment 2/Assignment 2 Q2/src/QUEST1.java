import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QUEST1{
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        boolean exit=false;
        while(!exit){
        System.out.println("ENTER THE WORD TO BE CHECKED ");
        String s=input.nextLine();
        char [] arr=s.toCharArray();
        int lenght=arr.length;
        boolean isPalindrome=true;
        for (int i=0; i < lenght/2;i++){
            if (arr[i]!=arr[lenght-1-i]){
                    isPalindrome=false;
               break;
            }

        }
        if(isPalindrome){
            System.out.println("THE WORD IS PALINDROME ");
            exit=true;
        }else {
            System.out.println("THE WORD IS NOT PALINDROME TRY AGAIN");
        }
        }
        input.close();


    }
}