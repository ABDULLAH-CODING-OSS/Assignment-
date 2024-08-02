import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class QUEST7{
    public static void main(String[] args) {

        String [] array={"car","cart","carrom"};
        if (array.length==0){
            System.out.println("EMPTY STRING");

        } else if (array.length==1) {
            System.out.println(array[0]);

        }
        else{
            String firstStr=array[0];
            for (int i=1;i<array.length;i++){
                String currStr=array[i];
                int j=0;
                while(j<currStr.length()&&j<firstStr.length()&&currStr.charAt(j)==firstStr.charAt(j)){
                    j++;
                }
                if (j==0){
                    System.out.println("NOT MATCHED");
                    return;

                }
                firstStr=currStr.substring(0,j);
            }
            System.out.println(firstStr);

        }


    }
}