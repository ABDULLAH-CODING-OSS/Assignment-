public class QUEST7{
	public static void main(String []args){
		int number=12345;
		int digit=number%10;
		number=(number-digit)/10;
		int sum = digit;
		 digit=number%10;
		number=(number-digit)/10;
		 sum =sum + digit;
		 digit=number%10;
		number=(number-digit)/10;
		 sum =sum + digit;
		digit=number%10;
		number=(number-digit)/10;
		 sum =sum + digit;
		digit=number%10;
		number=(number-digit)/10;
		 sum =sum + digit;
		System.out.println("THE SUM IS : "+(sum));
		
		
		
		
		
		
	}
}