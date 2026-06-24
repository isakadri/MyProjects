package homework;

public class CreditScore {
	public static void main(String[] args) {
		int salary=45000;
		int creditScore=700;
		int age=18;
		boolean citizn=true;
		int bankbalance=1500000;
		
		
		if(creditScore>=700 && age>=18  ) {
			  System.out.println("your credit score is good and your age is 18 you are eligible moving to next step");
			if(salary>=40000) {
				  System.out.println("your salary is good moving to next step");

				if(citizn) {
					System.out.println("you are citizen of india ");
					if(bankbalance>=100000) 
					{
						System.out.println("you are eligible");
					}
					else {System.out.println("not eligible");
					}
				}else {System.out.println("not eligible");}
				
			}else {
				System.out.println("not eligible");
			}
			
			
		}else {
			System.out.println("not eligible");
		}
		
	}
}
