package org.neos.synchronize.runnable;

public class TestCounter {

	public static void main(String[] args) {
		Counter counter = new Counter();
		
		Thread a = new CounterThread(counter);
		Thread b = new CounterThread(counter);
		a.start();
		b.start();
	}

}
