/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import data.LibroDaoJDBC;
import java.util.List;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Ing. en C. David
 */
public class Test {

    public static void main(String[] args) throws Exception {
            //Se llama a la interface buscar que extiende de la clase LibroDaoJDBC
            Buscar dao = new LibroDaoJDBC();
            //Se crea un arreglo de datos para buscar por palabra clave o titulo
            String titulosLibro[] = {"El magico mudo de jack","Aprende Java","los relatos de la noche"};
            //Se crea Una lista en base a los requerimientos para buscarla
            List<Libro> libro = dao.buscar(titulosLibro);
                libro.forEach((libro1) -> {
                System.out.println(libro1.getInformacion());
            });

            
    }
    
    
}
