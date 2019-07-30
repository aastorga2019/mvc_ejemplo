/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * @author AASTORGA
 */
package mvc_ejemplo;
//import com.ecodeup.controller.ClienteController;
//import com.ecodeup.model.Cliente;
//import com.ecodeup.view.ClienteView;
import mvc_ejemplo.ClienteController;
import mvc_ejemplo.Cliente;
import mvc_ejemplo.ClienteView;

public class Mvc_ejemplo {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // objeto vista, y modelo creado con el método estático 
    
             System.out.println("**** Inicio MVC_EJEMPLO ****");
    
		Cliente modelo= llenarDatosCliente();
		ClienteView vista= new ClienteView();
		
		//se crea un objeto controlador y se le pasa el modelo y la vista
		ClienteController controlador= new ClienteController(modelo, vista);
		
		// se muestra los datos del cliente
		controlador.actualizarVista();
		
		// se actualiza un cliente y se muestra de nuevo los datos
		controlador.setNombre("Luis");
		controlador.actualizarVista();	
    }
    
    //método estático que retorna el cliente con sus datos
    private static Cliente llenarDatosCliente() {
	Cliente cliente = new Cliente();
	cliente.setId(1);
	cliente.setNombre("Elivar");
	cliente.setApellido("Largo");
	return cliente;
    }    
}
