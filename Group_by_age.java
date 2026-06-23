package homework;

public class Group_by_age {
	public static void main(String[] args) {
		int age=9;
		
		if(age>=0 && age<=12) {
			System.out.println("Child");
		}else if(age>=13 && age<=19) {
			System.out.println("Teenage");
		}else if(age>=20 && age<=59) {
			System.out.println("Adult");
		}else {
			System.out.println("Senior Citizen");
		}
	}
}
