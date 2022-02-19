import java.util.Random;
import java.util.Scanner;

public class Gambler2 
{
	
public static void main(String[] args)
{
	Scanner inputScanner = new Scanner(System.in);
	System.out.println("Enter the gambler stake");
	
	int stake  =  inputScanner.nextInt();    // gambler's stating 
	
	System.out.println("Enter the gambler goal");
	int goal   = inputScanner.nextInt();   // gambler's goal 
	
	System.out.println("Enter the gambler bet");
	
	int trial =  inputScanner.nextInt() ;    // gambler's bet
		
	Random r = new Random();
	int randomnum = r.nextInt(2);
	
	
	    System.out.println("Enter the gambler");
	     
	    int st =100;        // 100rs everyday
	    int bets = 1;       // total number of bets 
	    int wins = 0;        // total number of games won

	     // repeat trials times
	     for (int t = 0; t < trial; t++) {
	         
	   }
	   
	     // do one gambler's ruin simulation
         int cash = stake;
         while (cash > 0 && cash < goal) {
             bets++;
          // win $1
          if (Math.random() < 0.5) cash++; 
          // lose $1
          else                     cash--;     
       }
         if (cash == goal) wins++;           
     
	     
	     
	}

}
