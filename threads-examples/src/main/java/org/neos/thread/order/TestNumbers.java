package org.neos.thread.order;

import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

public class TestNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		
		long t0 = (new Date()).getTime();
		
		int[] array1=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array2=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array3=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array4=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array5=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array6=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array7=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array8=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array9=UtilNumbers.generateListOfNumber(10000, 1000000);
		int[] array10=UtilNumbers.generateListOfNumber(10000, 1000000);
		
		OrderNumbers thread1 =  new OrderNumbers(array1);
		OrderNumbers thread2 = new OrderNumbers(array2);
		OrderNumbers thread3 = new OrderNumbers(array3);
		OrderNumbers thread4 = new OrderNumbers(array4);
		OrderNumbers thread5 = new OrderNumbers(array5);
		OrderNumbers thread6 = new OrderNumbers(array6);
		OrderNumbers thread7 = new OrderNumbers(array7);
		OrderNumbers thread8 = new OrderNumbers(array8);
		OrderNumbers thread9 = new OrderNumbers(array9);
		OrderNumbers thread10 = new OrderNumbers(array10);
		
		thread1.run();
		thread2.run();
		thread3.run();
		thread4.run();
		thread5.run();
		thread6.run();
		thread7.run();
		thread8.run();
		thread9.run();
		thread10.run();
		
		double n =thread1.getCount()+thread2.getCount()+thread3.getCount()+
				thread4.getCount()+thread5.getCount()+thread6.getCount()+
				thread7.getCount()+thread8.getCount()+thread9.getCount()+
				thread10.getCount();
		long t1 = (new Date()).getTime();
		NumberFormat formatter = new DecimalFormat("###,###,###"); 
		System.out.println("NUMEROS ORDENADOS: " + formatter.format(n) + 
				" CALCULADO EN " + formatter.format(t1 - t0) + " miliseg.");
		    
		

	}

}
