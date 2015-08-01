package org.neos.handle.file.controller;

import java.io.BufferedReader;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.neos.handle.file.business.FileUtils;

/**
 * Servlet implementation class ReadFile
 */
@WebServlet(description = "This Servlet read a File", urlPatterns = { "/ReadFile" })
public class ReadFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ReadFile() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("SE VA A LEER EL ARCHIVO");
		
		String nameFile = "cliente.txt";
		String view="seccessfulRead.jsp";
		String path = "/WEB-INF/" ;
		ServletContext context = this.getServletConfig().getServletContext();
		String pathname =context.getRealPath(path+nameFile); 
		RequestDispatcher forward;
		BufferedReader br = null;
		String cadenaFinal="";
		try{
			cadenaFinal=FileUtils.readFile(pathname);
			
		}catch(Exception e){
			e.printStackTrace();
			view="error.jsp";
		}finally{
			if (br != null)br.close();
		}
		System.out.println("Done");
		forward= request.getRequestDispatcher("/"+view);  
		request.setAttribute("cadenaFinal", cadenaFinal);
		forward.include(request, response);
		
		   
	}
		

}
