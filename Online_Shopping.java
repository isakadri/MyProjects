package homework;

public class Online_Shopping {
	public static void main(String[] args) {
		int amm=10000;
		String member="yes";
		
		if(amm>1000) {
			if(member=="yes") {
				float discount=amm*0.2f;
				
				float total=amm-discount;
				
				System.out.println(" you are member discount "+discount + " your ammount is "+ total);
			}else {
				float discount=amm*0.1f;
				
				float total=amm-discount;
				
				System.out.println("discount "+discount + "your ammount is "+ total);
			}
		}else {
			System.out.println("no discount");
		}
	}
}
