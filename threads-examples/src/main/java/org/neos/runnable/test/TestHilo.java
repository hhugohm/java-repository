package org.neos.runnable.test;

import java.util.Random;

import org.neos.runnable.domain.Hilo;

public class TestHilo {
	
	public static void main(String args[]){
		Random aleatorio = new Random(1337);
		for (int i = 0; i < 10; i++) {
			// Un hilo tendrá un tiempo de ejecución comprendido entre los 0 y
			// 10 segundos.
			new Thread(new Hilo(i, aleatorio.nextInt(10000))).start();
		}
		
	}

}
