package org.neos.runnable.domain;

public class HiloHijo extends Hilo {

	public HiloHijo() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void run() {
		System.out.println("Soy el hilo hijo y he iniciado mi ejecución.");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println(e);

			return;
		}
		System.out.println("Soy el hilo hijo y he finalizado mi ejecución.");
	}
}
