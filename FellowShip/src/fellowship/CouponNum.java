package fellowship;

import java.util.Scanner;

public class CouponNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the no.");
		int n=sc.nextInt();
		char[] chars="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ123456789".toCharArray();
		int max=100000000;
		int random=(int) (Math.random()*max);	
		StringBuffer sb=new StringBuffer();
				
		while (random>0)
				{
			        sb.append(chars[random % chars.length]);
			        int leng = chars.length;
			        System.out.print(leng);
					random /= chars.length;
					
					
				}

				String couponCode=sb.toString();
				System.out.println("Coupon Code: "+couponCode);	
	}

}
