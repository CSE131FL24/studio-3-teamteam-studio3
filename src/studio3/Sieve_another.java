package studio3;

import java.util.Scanner;

public class Sieve_another {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
	       System.out.print("Enter the number : ");
	       int n = input.nextInt();
	       boolean[] arr = new boolean[n+1];
	       for (int i = 2; i <= (int) Math.sqrt(n); i++) {
	    	   for (int j = 2; j <= n; j++) {
	    		   if (j % i == 0 && j != i) {
	    			   arr[j] = true;
	    		   }
	    	   }
	       }
	       for (int i = 2; i <= n; i++) {
	           if (!arr[i]) {
	               System.out.print(i + " ");
	           }
	       }

	}

}
