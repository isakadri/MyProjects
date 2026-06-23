package homework;

public class Day_week {
	public static void main(String[] args) {
		int day_num=5;
		
		if(day_num>0 && day_num<=7) {
			if(day_num==1) {
				System.out.println("Monday");
			}else if(day_num==2) {
				System.out.println("Tuesday");
			}else if(day_num==3) {
				System.out.println("Wednsday");
			}else if(day_num==4) {
				System.out.println("thursday");
			}else if(day_num==5) {
				System.out.println("Friday");
			}else if(day_num==6) {
				System.out.println("Saturday");
			}else if(day_num==7) {
				System.out.println("Sunday");
			}
		}else {
			System.out.println("Invalid Day");
		}
	}
}
