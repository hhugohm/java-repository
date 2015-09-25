package org.neos.patterns.facade.test;

import org.neos.patterns.facade.Fiscal;

public class FacadeTest {

	public static void main(String[] args) {
		
		Fiscal calculoFiscal = new Fiscal();
		
		System.out.println("P Fisica IVA= "+ calculoFiscal.getIvaFisica(25000));
		System.out.println("P Moral IVA= "+  calculoFiscal.getIvaMoral(25000));
		

	}

}
