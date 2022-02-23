package towerOfHanoi;

/*
 * Mary Curran Computer Science 3 Assignment 14
 * 
 * 
 * @author Mary Curran
 * @since 11/2/2021
 * @version 1.0
 * */



import java.util.Scanner;

public class Hanoi {
	
		    static void towerOfHanoi(int n, char fromRod, char toRod, char helperRod)
		    {
		        if (n == 1)
		        {
		            System.out.println("Take disk 1 from rod " +  fromRod + " to rod " + toRod);
		            return;
		        }
		        towerOfHanoi(n-1, fromRod, helperRod, toRod);
		        System.out.println("Take disk " + n + " from rod " +  fromRod + " to rod " + toRod);
		        towerOfHanoi(n-1, helperRod, toRod, fromRod);
		    }
		 
		    public static void main(String args[])
		    {
		    	Scanner scanner = new Scanner (System.in); 
		    	
		    	System.out.print("Enter number of disks: ");
		    	
		        int n = scanner.nextInt();
		        towerOfHanoi(n,'A','C', 'B');
		    }
		 
		 
		
		
		
	}


