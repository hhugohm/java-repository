package org.neos.patterns.facade;

public class Fiscal {
	
	private PersonaFisica fisica;
	private PersonaMoral moral;
	
	public Fiscal(){
		fisica= new PersonaFisica();
		moral= new PersonaMoral();
	}
	
	public float getIvaFisica(float sueldo){
		
		return fisica.getIva(sueldo);
	}
	
	public float getIvaMoral(float sueldo){
		
		return moral.getIva(sueldo);
	}

}
