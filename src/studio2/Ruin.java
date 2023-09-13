package studio2;

import java.util.Random;
import java.util.Scanner;

public class Ruin {

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
      int simulation = 0;
      	if (Math.random() > winChance)
		{ 
      		startAmount -= 1 ;
      		System.out.println("Simulation " + simulation +": " + (startAmount -= 1)+ " LOSE");
		}
      	else
      	{
    	   startAmount += 1;
    	   System.out.println("Simulation " + simulation + ": "+ (startAmount += 1)+ " WIN");
    	 }
      simulation ++;
      }
    
      if (startAmount == winLimit) { 
    		  System.out.println("Win!");}  
      else if (startAmount < winLimit) {
           System.out.println(" ");} 
      else if (startAmount == 0) {
    		  
    	  System.out.println("Ruin!");} 
    
   
       
       }

	}


