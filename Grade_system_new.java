package homework;

public class Grade_system_new {
	public static void main(String[] args) {
		int mark=49;
		
		if(mark>=40) {
			System.out.println("pass");
			if(mark>=90) {
				System.out.println("A");
			}else if(mark>75) {
				System.out.println("B");
			}else {
				System.out.println("c");
			}
		}else {
			System.out.println("fail");
		}
		
	}
}
