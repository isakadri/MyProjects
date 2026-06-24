package homework;

public class Unit_pay {
	public static void main(String[] args) {
		int  unit=120;
		if(unit <=100) {
			System.out.println("your bill is "+(unit*5)+" as per 5rs per unit");
		}else if(unit <=200 ) {
			System.out.println("your bill is "+(unit*7)+" as per 7rs per unit");
		}else {
			System.out.println("your bill is "+(unit*10)+" as per 10rs per unit");

		}
	}
}
