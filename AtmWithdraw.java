package homework;

import java.util.*;

public class AtmWithdraw {
	public static void main(String[] args) {
		int withdraw=100;
		
		
		
		int balance=10000;
		
		if(balance<withdraw) {
			if(withdraw %100==0) {
				balance-=withdraw;
				System.out.println(balance);
			}else {
				System.out.println("invalid demoniation");
			}
		}else {
			System.out.println("Insufficient ammount");
		}
		
		
	}
}
