package studio2;

import java.util.Scanner;

public class Ruinl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
	       
	       System.out.println("Start Amount: ");       
	       double startAmount = in.nextDouble();
	       
	       System.out.println("Win Chance: ");
	       double winChance = in.nextDouble();
	       
	       System.out.println("Win limit: ");       
	       double winLimit = in.nextDouble();
	       
	      while ((winLimit > startAmount) && (startAmount > 0)){
	   
	      	if (Math.random() > winChance)
			{ 
	      		startAmount = startAmount - 1 ;
	      		System.out.println(startAmount+ " LOSE");
			}
	      	else
	      	{
	    	   startAmount = startAmount+1;
	    	   System.out.println(startAmount+ " WIN");
	      	}
	      if (startAmount == 0) {	
	    	  System.out.println("RUIN");
	      }
	      else {
	    	  if (winLimit == startAmount) {
	    		  
	    		  System.out.println("SUCCESS");}
	      	else {
	      		System.out.println(" ");
	      	}
	      		
	      	 
	   
	       
	       }

		}
	}}



