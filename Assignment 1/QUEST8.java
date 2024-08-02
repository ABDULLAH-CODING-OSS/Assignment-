public class QUEST8{
	public static void main(String [] args){
		int population=80000;
		double numberOfMen=(52.0*population)/100.0;
		double literateMen=(35.0*numberOfMen)/100.0;
		double illiterateMen=numberOfMen-literateMen;
		double numberOfWomen=(48.0*population)/100.0;
		double illiterateWomen=(87.0*numberOfWomen)/100.0;
		System.out.println("THE ILLETERATE MEN ARE :"+(illiterateMen));
		System.out.println("THE ILLETERATE WOMEN ARE :"+(illiterateWomen));
		
		
	}
}
