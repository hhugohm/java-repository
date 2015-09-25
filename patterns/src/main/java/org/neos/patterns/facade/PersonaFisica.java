package org.neos.patterns.facade;

public class PersonaFisica implements Persona {

	public float getIva(float sueldo) {
		float iva= 0.15f;
		return sueldo*iva;
	}

	public float declaracionAnual(float montoAnual) {
		// TODO Auto-generated method stub
		return 0;
	}

}
