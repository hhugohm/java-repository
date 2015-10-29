package org.neos.synchronize.runnable;

public class CounterThread extends Thread{
	
	protected Counter counter = null;

    public CounterThread(Counter counter){
       this.counter = counter;
    }

    public void run() {
    	for(int i=0; i<10; i++){
    	  String threadName = Thread.currentThread().getName();
    	  try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
          counter.add(i,threadName);
          
    	}
    }

}
