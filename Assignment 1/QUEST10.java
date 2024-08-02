import java.util.Scanner;
public class QUEST10{

	public static void main(String [] args){
			Scanner scanner=new Scanner(System.in);
			System.out.println("PLEASE ENTER THE TOTAL SELLING PRICE ");
			double totalSellingPrice=scanner.nextDouble();
			double totalCostPrice=totalSellingPrice/1.20;
			double costPricePerItem=totalCostPrice/15;
			System.out.println("THE COST PRICE PER ITEM IS "+(costPricePerItem));
		
		
		
		
		
		
		
	}
}