package org.neos.synchronize.runnable;

public class Counter {
	
	long count=0;
	
	public synchronized void add(long value,String threadName){
		this.count +=value;
		System.out.println("threadName: " +threadName+"i= "+value+"contador: "+ this.count);
	}

}
