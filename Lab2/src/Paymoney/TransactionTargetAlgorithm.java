package com.greatlearning.services;

public class TransactionTargetAlgorithm {

	public void processTransactions(int[] prefixSum, int target) {
        //int sum = 0; 
        int flag = 0;
        for (int i=0; i<prefixSum.length; i++) { //linear iteration, linear searching
            //sum += transactions[i];
            //check if target is achieved
            if(prefixSum[i] >= target) {
            	System.out.println("Target achieved after "+(i+1) +" transactions ");
            	flag = 1;
            	break;
            }
        }
		//check if looped across all the transactions
        if(flag == 0) {
        	System.out.println("Given target is not achieved ");
        }
	}
}
