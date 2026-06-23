package homework;

public class Grade_System {
	public static void main(String[] args) {
		int grade=76;
		
		if(grade>=90 && grade<=100) {
			System.out.println("A");
		}else if(grade>=75 && grade<=89) {
			System.out.println("B");
		}else if(grade>=50 && grade<=74) {
			System.out.println("C");
		}else if(grade>=35 && grade<=49) {
			System.out.println("B");
		}else {
			System.out.println("Fail");
		}
	}
}
