package org.neos.runnable.domain;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Hilo implements Runnable{
	
	private int nombre;
	private int duracion;
	
	public Hilo(){}
	
	public Hilo(int nombre,int duracion){
		this.nombre=nombre;
		this.duracion=duracion;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public void run() {
		System.out.println("Soy el hilo padre y he iniciado mi ejecuci�n para crear un hilo hijo.");

		Thread hiloQueFinalizaAntes = new Thread(new HiloHijo()); // Creamos el
																	// hijo.
		hiloQueFinalizaAntes.start(); // El proceso hijo empieza a estar listo.
		try {

			hiloQueFinalizaAntes.join(); // Ahora el padre espera a que el hijo
											// finalice antes su ejecuci�n.

		} catch (InterruptedException e) { // Join puede lanzar una interrupci�n
											// al igual que sleep.

			System.out.println(e);

			return;

		}
		System.out.println("Soy el hilo padre y he finalizado mi ejecuci�n."); // El padre no espera por el hijo.																		// hijo.

	}

}

	/*
	public void run() {
		System.out.println("soy el hilo--> "+ this.nombre+" y he iniciado mi ejecucion");
		
		try{
			System.out.println("soy el hilo@ "+this.nombre +" y voy a parar mi ejecucion: "+ this.duracion+"ms");
			 if (this.nombre==5) throw new InterruptedException();
			Thread.sleep(this.duracion);
		}catch(InterruptedException e){
			System.out.println("INTERRUPCI�N INESPERADA DEL HILO "+this.nombre);
		    // El flag interrupted de la clase Thread se activa:
			System.out.println("FLAG DE INTERRUPCI�N VALE "+Thread.interrupted());
			Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, e);
		}
		System.out.println("Soy el hilo-> "+this.nombre+" y he finalizado mi ejecuci�n.");
	}
*/
	

