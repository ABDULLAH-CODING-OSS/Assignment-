import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QUEST5{
    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER");
        String str = input.nextLine();
            int mInt = Integer.parseInt(str);
        if (mInt<3999) {
            String[] romanCh = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};// ADDING MORE SYMBOLS BY RND
            int[] returnValues = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
            String returnValue = "";
            for (int i = 0; i < returnValues.length; i++) {
                while (mInt >= returnValues[i]) {
                    returnValue += romanCh[i];
                    mInt -= returnValues[i];
                }
//       int num =mInt / returnValues[i];    THIS CODE WAS GIVING ERROR IN PRINTING 17 & 18 SO IT HAS SOME ISSUES
//       if (num==0)continue;
//       returnValue+=(num==4&& i>0)? romanCh[i]+romanCh[i-1]:romanCh[i];
//       mInt%=returnValues[i];

            }
            System.out.println(returnValue);
        }
        else{
            System.out.println("ROMAN NUMBER DOESNT REPRESENT NUMBER GREATER THEN 3999");
        }



    }
}