package org.neos.handle.file.business;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	
	
	public static boolean createFile(String path,String content){
		boolean action=true;
		
		try{
			System.out.println("file:"+path);
			File file = new File(path);
			
			if (!file.exists()) {
					file.createNewFile();
			}
			 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			 
			
			
			
		}catch(Exception e){
			e.printStackTrace();
			action=false;
		}
		
		return action;
	}
	
	public static String readFile(String path){
		String cadenaFinal="";
		BufferedReader br = null;
		try{
			System.out.println("file:"+path);
			String sCurrentLine;
			 
			br = new BufferedReader(new FileReader(path));
 
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				cadenaFinal = cadenaFinal+ " "+ sCurrentLine;
			}
			
		}catch(Exception e){
			e.printStackTrace();
			
		}finally{
			if (br != null)
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
		return cadenaFinal;
	}

}
