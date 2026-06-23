package homework;

public class Temp_Classify {
	public static void main(String[] args) {
		int temp=10;
		
		if(temp>=25 && temp<=35) {
			System.out.println("Warm");
		}else if(temp>=36) {
			System.out.println("Hot");
		}else if(temp>=10 && temp<=24) {
			System.out.println("Coool");
		}else {
			System.out.println("Cold");
		}
	}
}
