package homework;

public class Ticket_catagory {
	public static void main(String[] args) {
		int age=18;
		if(age>=18) {
			System.out.println("young");
			
			if(age>=60) {
				System.out.println("Senior Discount");
			}else {
				System.out.println("normal price");
			}
		} else {
			System.out.println("child ticket");
		}
	}
}
