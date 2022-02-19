import java.util.Scanner;

public class Gambler
{

public static void main(String[] args)
{
	int stake  = Integer.parseInt(args[0]);    // gambler's stating 
    int goal   = Integer.parseInt(args[1]);    // gambler's desired 
    int trials = Integer.parseInt(args[2]);    // number of trials to perform
	Scanner sc = new Scanner(System.in);
	
	
    System.out.println("Enter the glamber");
     
    int st =100;        // 100rs everyday
    int bets = 1;       // total number of bets 
    int wins = 0;        // total number of games won

     // repeat trials times
     for (int t = 0; t < trials; t++) {
         
     }

     // print results
     System.out.println(wins + " wins of " + trials);
     System.out.println("Percent of games won = " + 100.0 * wins / trials);
     System.out.println("Avg # bets           = " + 1.0 * bets / trials);
 }

}