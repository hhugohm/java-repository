package org.neos.thread.order;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Date;

public class TestNumberThreads {

	public static void main(String[] args) {
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
		
		OrderNumbersThread thread1 =  new OrderNumbersThread(array1);
		OrderNumbersThread thread2 = new OrderNumbersThread(array2);
		OrderNumbersThread thread3 = new OrderNumbersThread(array3);
		OrderNumbersThread thread4 = new OrderNumbersThread(array4);
		OrderNumbersThread thread5 = new OrderNumbersThread(array5);
		OrderNumbersThread thread6 = new OrderNumbersThread(array6);
		OrderNumbersThread thread7 = new OrderNumbersThread(array7);
		OrderNumbersThread thread8 = new OrderNumbersThread(array8);
		OrderNumbersThread thread9 = new OrderNumbersThread(array9);
		OrderNumbersThread thread10 = new OrderNumbersThread(array10);
		
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread10.start();
		
		try {
			thread1.join();
			thread2.join();
			thread3.join();
			thread4.join();
			thread5.join();
			thread6.join();
			thread7.join();
			thread8.join();
			thread9.join();
			thread10.join();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	double n =thread1.getCount()+thread2.getCount()+thread3.getCount()+
			thread4.getCount()+thread5.getCount()+thread6.getCount()+
			thread7.getCount()+thread8.getCount()+thread9.getCount()+
			thread10.getCount();
	long t1 = (new Date()).getTime();
	NumberFormat formatter = new DecimalFormat("###,###,###"); 
	System.out.println("NUMEROS ORDENADOS: " + formatter.format(n) + " CALCULADO EN " + formatter.format(t1 - t0) + " miliseg.");
	
	}

}
