package homework;

public class Even_odd_AndCheck {
		public static void main(String[] args) {
				int num=57;
				if(num%2==0) {
					System.out.println("Even");
					if(num>50) {
						System.out.println("Greater");
					}
				}else if(num%2==1) {
					if(num>50) {
						System.out.println("Greater");
					}
					System.out.println("Odd");
				}
		}
}
