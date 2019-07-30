/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_ejemplo;

/**
 *
 * @author AASTORGA
 */
public class ClienteView {
    public void imprimirDatosCliente(int id,String nombre, String apellido) {
	System.out.println("**** DATOS CLIENTE ****");
	System.out.println("Id: "+id);
	System.out.println("Nombre: "+nombre);
	System.out.println("Apellido: "+apellido);
        System.out.println("4to. campo");
    }
}
