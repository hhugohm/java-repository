package org.neos.patterns.factory;

public class FactoryPerson {
	
	public static Person getInstancePerson(PersonType type){
		Person person= null;
		
		switch(type){
			case  FISICA:{
				person = new PersonaFisica();
				break;
			}
			case MORAL:{
				person= new PersonaMoral();
				break;
			}
			default:{
				person=null;
			}
		
		}
		
		return person;
	}

}
