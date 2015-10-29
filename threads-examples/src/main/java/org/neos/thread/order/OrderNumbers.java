package org.neos.thread.order;

public class OrderNumbers {
	private int[] array;
	private double count;
	
	public OrderNumbers(int[] array){
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
