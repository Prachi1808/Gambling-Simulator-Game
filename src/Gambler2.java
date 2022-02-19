import java.util.Scanner;

public class Gambler2 
{
	

public static void main(String[] args)
{
		int stake  = Integer.parseInt(args[0]);    // gambler's stating 
	    int goal   = Integer.parseInt(args[1]);    // gambler's desired 
	    int trial = Integer.parseInt(args[2]);    // number of trial to perform
		Scanner sc = new Scanner(System.in);
		
		
	    System.out.println("Enter the glamber");
	     
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
