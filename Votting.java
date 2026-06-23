package homework;

public class Votting {
	public static void main(String[] args) {
		int age=26;
		if(age>18) {
			
			System.out.println("you can Vote" );
			if(age>=25) {
				System.out.println("And you can contest");
			}else {
				System.out.println("you cant Contest");
			}
		}else {
			System.out.println("you are not eligible");
		}
	}
}
