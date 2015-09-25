package org.neos.patterns.facade;

public class PersonaMoral implements Persona {

	public float getIva(float sueldo) {
		float iva= 0.16f;
		return sueldo*iva;
	}

	public float declaracionAnual(float montoAnual) {
		// TODO Auto-generated method stub
		return 0;
	}

}
