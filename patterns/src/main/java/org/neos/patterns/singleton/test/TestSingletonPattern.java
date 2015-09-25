package org.neos.patterns.singleton.test;

import org.neos.patterns.singleton.SingletonClass;

public class TestSingletonPattern {

	public static void main(String[] args) {
		
		SingletonClass instance1= SingletonClass.getInstanceSingleton();
		SingletonClass instance2= SingletonClass.getInstanceSingleton();
		
		System.out.println("instancia 1: " + System.identityHashCode(instance1));
		System.out.println("instancia 2: " + System.identityHashCode(instance2));
		
		if(instance1==instance2){
			System.out.println("las instancias son las mismas");
		}
		if(instance1.equals(instance2)){
			System.out.println("las instancias son las mismas");
		}
		
		

	}

}
