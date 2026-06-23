package homework;

public class Check_triangle_type {
	public static void main(String[] args) {
		int side1=102;
		int side2=101;
		int side3=103;
		
		if(side1==side2 && side2==side3) {
			System.out.println("Equeliteral");
		}else if(side1!=side2 && side2!=side3 && side1!=side3) {
			System.out.println("Scalene");
		}else {
			System.out.println("Isosceles");
		}
	}
}
