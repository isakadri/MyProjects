package homework;

public class Leap_year_and_Century_yr {
		public static void main(String[] args) {
			int year=2000;
			
			if(year%4==0) {
				System.out.println("Its a leap Year");
				if(year%400==0) {
					System.out.println("Its a Century Year");
				}
			}else {
				System.out.println("Not Leap");
			}
		}
}
