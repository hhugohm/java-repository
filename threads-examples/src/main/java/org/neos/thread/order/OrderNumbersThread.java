package org.neos.thread.order;

public class OrderNumbersThread extends Thread {

	private int[] array;
	private double count;
	
	public OrderNumbersThread(int[] array){
		this.array=array;
	}
	
	public void run() {
	
		int[] array1 = UtilNumbers.burbuja(this.array);
		for(int number:array1){
			System.out.println(number);
			this.count++;
		}
		
	}

	public double getCount() {
		return count;
	}
	

}
