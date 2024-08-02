import java.util.Scanner;

public class QUEST9{
	public static void main(String [] args){
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("PLEASE ENTER THE AMOUNT in 100s TO WITHDRAW :");
		int amount=scanner.nextInt();
		if(amount>0&&amount <=999){
		
		int amount100=amount/100;
		System.out.println("THE WITHDRAWL CONTAINS "+(amount100)+" HUNDRED RS NOTES ");
		amount=amount-(amount100*100);
		int amount50=amount/50;
		System.out.println("THE WITHDRAWL CONTAINS "+(amount50)+" FIFTY RS NOTES ");
		amount=amount-(amount50*50);
		int amount10=amount/10;
		System.out.println("THE WITHDRAWL CONTAINS "+(amount10)+" TEN RS NOTES ");
		amount=amount-(amount10*10);
		System.out.println("THE WITHDRAWL CONTAINS "+(amount)+" NUMBER OF PENNIES");
		}
		else{
			System.out.println("INVALID AMOUNT ");
			
			}
			scanner.close();
	}
}