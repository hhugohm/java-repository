package org.neos.thread.order;

import java.util.Random;

public class UtilNumbers {
	
	
	public static int[] generateListOfNumber(int numbers,int range){
		int[] listNumbers= new int[numbers];
		
		Random  randon = new Random ();
		
		 for (int x = 1; x < numbers; ++x){
		      int randomInt = randon.nextInt(range);
		      listNumbers[x]=randomInt;
		    }
		
		return listNumbers;
	}
	
	 public static  int[] burbuja(int arreglo[]){
	        for(int i = 0; i < arreglo.length - 1; i++)
	        {
	            for(int j = 0; j < arreglo.length - 1; j++)
	            {
	                if (arreglo[j] < arreglo[j + 1])
	                {
	                    int tmp = arreglo[j+1];
	                    arreglo[j+1] = arreglo[j];
	                    arreglo[j] = tmp;
	                }
	            }
	        }
	        return arreglo;
	    }

}
