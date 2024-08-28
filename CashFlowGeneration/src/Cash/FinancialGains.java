package Cash;

import java.util.Scanner;
public class FinancialGains {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your buying each share price:");
		double buyingPrice = sc.nextDouble();
		int day=1;
		double closePrice=0.1;
		
		while(true)
		{
			System.out.println("Enter your closing price for day "+ day +" (enter any negative value to leave):");
			closePrice = sc.nextDouble();
			if(closePrice<0.0)
			{
				break;
			}
			
			double earnings = closePrice-buyingPrice;
			
			if(earnings>0.0)
			{
				
				System.out.println("After day "+ day + " you earned "+ earnings +" per share.");
			}
			
			else if(earnings<0.0)
			{
				
				System.out.println("After day "+ day + " you loss "+ earnings +" per share.");
			}
			
			else
			{
				System.out.println("After day "+ day +", you have no earnings per share.");
			}
			
			int days = day+=1;
			
			System.out.println();
			System.out.println("-------------------day" + days +"-------------------");
		}
		
		sc.close();
		System.out.println("-----------------Thank You-----------------");

	}
	
	

}
