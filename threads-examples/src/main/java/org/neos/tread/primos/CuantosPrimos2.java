package org.neos.tread.primos;

import java.util.Date;

public class CuantosPrimos2 {
	public static void main(String[] args) {
		long t0 = (new Date()).getTime();
		PrimosThread p1 = new PrimosThread(1, 2000000);
		PrimosThread p2 = new PrimosThread(2000001, 4000000);
		PrimosThread p3 = new PrimosThread(4000001, 6000000);
		PrimosThread p4 = new PrimosThread(6000001, 8000000);
		PrimosThread p5 = new PrimosThread(8000001, 10000000);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		try {
			p1.join();
			p2.join();
			p3.join();
			p4.join();
			p5.join();
		} catch (InterruptedException e) {
		}
		int n = p1.cuantos() + p2.cuantos() + p3.cuantos() + p4.cuantos() + p5.cuantos();
		long t1 = (new Date()).getTime();
		System.out.println("Número de primos menores que 10000000: " + n + " calculado en " + (t1 - t0) + " miliseg.");
	}
}