package org.neos.patterns.factory;

public class PersonaFisica implements Person {

	public float getIva(float sueldo) {
		float iva= 0.15f;
		return sueldo*iva;
	}

	public float declaracionAnual(float montoAnual) {
		// TODO Auto-generated method stub
		return 0;
	}

}
