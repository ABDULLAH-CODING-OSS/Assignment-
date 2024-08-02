import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QUEST8{
    public static void main(String[] args) {

Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE STRING");
        String str = input.nextLine();
        String newStr="";
        char[] arr= str.toCharArray();
        for (int i=0;i<arr.length;i++){
           int j;
           for(j=0;j<i;j++){
               if (arr[i]==arr[j]){
                   break;
               }

           }
           // duplicate
           if (i==j){
               newStr+=arr[i];
           }
        }
        System.out.println(newStr );
        char[] arr1 = newStr.toCharArray();
        Arrays.sort(arr1);
       newStr = String.valueOf(arr1);
        System.out.println(newStr);




    }
}