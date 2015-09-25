package org.neos.patterns.singleton;

public class SingletonClass {
	
	private static SingletonClass instance = null;
	
	private SingletonClass(){}
	
	public static SingletonClass getInstanceSingleton(){
		if(instance==null){
			instance= new  SingletonClass();
		}
		
		return instance;
		
	}

}
