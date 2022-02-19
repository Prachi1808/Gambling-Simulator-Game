import java.util.Random ;
import java.util.Scanner;

public class Gambler0
{

	public static void main(String[] args)
	{
	int amount = 100;	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the no. of Days")	;
	int Day = sc.nextInt();
	int Total = 100;	
	for (int i=1; i<=Day;i ++)
	{
	 int k = (Total+(Total/2));
	 for (amount=1; amount<=k;amount++)
	 {
		 
	 
	int bet = (int) Math.floor((Math.random()*10)%2);
	if (bet ==1)
	{
	
	 
	System.out.println("Won")	;
	Total = Total+1;
	System.out.println("Amount =" + Total);	
	
	}
	
	System.out.println("Loose")	;
	Total = Total-1;
	System.out.println("Amount =" + Total);	
		
			
		
	 }
  }
 }
}

