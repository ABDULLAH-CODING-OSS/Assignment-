public class QUEST6{
	public static void main(String [] args){
		int lenght=36;
		int width=36;
		int radious=36;
		double areaOfCircle=Math.PI*radious*radious;
		double areaOfRectangle=lenght*width;
		double perimeter=2*(lenght+width);
		double circumference=2*Math.PI*radious;
		System.out.println("THE AREA OF RECTANGLE IS : "+(areaOfRectangle));
		System.out.println("THE AREA OF CIRCLE IS : "+(areaOfCircle));
		System.out.println("THE PERIMETER IS : "+(perimeter));
		System.out.println("THE CIRCUMFERENCE IS : "+(circumference));
		
	}
}