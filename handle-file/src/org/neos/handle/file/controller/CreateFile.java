package org.neos.handle.file.controller;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CreateFile
 */
@WebServlet(description = "This Servlet create a File", urlPatterns = { "/CreateFile" })
public class CreateFile extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateFile() {
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
	 * @throws IOException 
	 * @throws ServletException 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException   {
		System.out.println("EN EL SERVLET PARA CREAR EL ARCHIVO...");
		
		//String nameFile = request.getParameter("nameFile");
		String nameFile = "cliente.txt";
		String content = request.getParameter("message");
		String view="successfulWrite.jsp";
		String path = "/WEB-INF/" ;
		ServletContext context = this.getServletConfig().getServletContext();
		String pathname =context.getRealPath(path+nameFile); 
		RequestDispatcher forward;
		try{
			System.out.println("file:"+pathname);
			File file = new File(pathname);
			
			if (!file.exists()) {
					file.createNewFile();
			}
			 
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			 
			
			
			
		}catch(Exception e){
			
			e.printStackTrace();
			view="error.jsp";
		}
		System.out.println("Done");
		forward= request.getRequestDispatcher("/"+view);  
		forward.include(request, response);
		
		   
	}

}
