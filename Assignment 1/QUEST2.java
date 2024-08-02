public class QUEST2{
	
	public static void main(String [] args){
		int distanceKiloMeters=2614;
		double distanceMeters=distanceKiloMeters*1000;
		double distanceFeet=distanceKiloMeters*3280.84;
		double  distanceInches=distanceKiloMeters*39370.1;
		double distanceCentiMeters=distanceKiloMeters*100000;
		System.out.println("THE DISTANCE IN METERS IS : "+(distanceMeters));
		System.out.println("THE DISTANCE IN FEET IS : "+(distanceFeet));	
        System.out.println("THE DISTANCE IN CENTIMETERS IS : "+(distanceCentiMeters));		
		System.out.println("THE DISTANCE IN INCHES IS : "+(distanceInches));
		
}}	