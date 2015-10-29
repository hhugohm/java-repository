package com.company.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.company.services.UsuarioService;
import com.mycompany.modelo.Usuario;

public class UsuarioServiceTest {
	

   

    public static void main(String[] args) throws Exception {

    	ApplicationContext ctx;
        Usuario usuario = new Usuario();
        
    	 String[] paths = {  "src/main/resources/usuario.xml" };
         ctx = new FileSystemXmlApplicationContext(paths);
         
    	 UsuarioService service = (UsuarioService)ctx.getBean( "usuarioServiceTarget" );
         usuario.setNombre( "diego" );
         usuario.setApellidos( "herrera" );
         usuario.setDireccion( "loria 134" );
         
         service.consultaUsuario(usuario);
         service.agregarUsuario(usuario);       
         service.consultaUsuario_alternativo(usuario);
         service.actualizarUsuario(usuario);
         service.procesarInformacion();
         service.ProbarThrowException();
    }

    
}
