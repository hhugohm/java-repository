package org.neos.runnable.test;

import org.neos.runnable.domain.Hilo;

public class TestHiloConcurrencia {

	public static void main(String[] args) {
		
		Thread hilo = new Thread(new Hilo());
		hilo.start();// Ahora sí que el primer hilo se ejecuta
		

	}

}
