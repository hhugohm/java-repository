package org.neos.patterns.factory.test;

import org.neos.patterns.factory.FactoryPerson;
import org.neos.patterns.factory.Person;
import org.neos.patterns.factory.PersonType;

public class FactoryTest {

	public static void main(String[] args) {
		Person personF = FactoryPerson.getInstancePerson(PersonType.FISICA);
		Person personM = FactoryPerson.getInstancePerson(PersonType.MORAL);
		
		System.out.println("P Fisica IVA= "+ personF.getIva(25000));
		System.out.println("P Moral IVA= "+  personM.getIva(25000));

	}

}
