/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import domain.LibroDTO;
import java.util.ArrayList;
import java.util.List;
import org.biblioteca.excepciones.LibroNoEncontradoException;
import org.biblioteca.interfaces.Buscar;
import org.biblioteca.interfaces.Libro;

/**
 *
 * @author Ing. en C. David
 */
public class LibroDaoJDBC implements Buscar {

    /**
     *
     * @param palabrasClaves
     * @return
     * @throws Exception
     */
    @Override
    public List<Libro> buscar(String... palabrasClaves) throws Exception {
        //Se simula la obtencion de modelo mediante una lista llena
        LibroDTO arrayLibros[] = llenarLista();
        //Se crea el objeto Lista para agregarse cada libro que encuentre coincidencias
        List<Libro> listaLibros = new ArrayList<>();
        //Se cre
        Libro dato; //Se crea un objeto de la interface llamado dato que nos servira para agregar cada informacion
        //Se recorre la lista generada
        for (LibroDTO arrayLibro : arrayLibros) {
            for (String palabrasClave : palabrasClaves) {
                try {
                    if (arrayLibro.getTitulo().equalsIgnoreCase(palabrasClave)) {
                        dato = arrayLibro;
                        listaLibros.add(dato);
                    } else { 
                        throw new LibroNoEncontradoException("no encontrado");
                    }
                } catch (LibroNoEncontradoException e) {
                    System.out.println(e.getMessage());
                }
            }

        }

        return listaLibros;
    }

    private LibroDTO[] llenarLista() {
        LibroDTO arrayLibros[] = new LibroDTO[2];
        LibroDTO libroDTO = new LibroDTO();
        libroDTO.setId(1);
        libroDTO.setTitulo("El magico mudo de jack");
        libroDTO.setDescripcion("un mundo de colores");
        libroDTO.setUnidadesDisponibles(20);
        LibroDTO libroDTO1 = new LibroDTO();
        libroDTO1.setId(2);
        libroDTO1.setTitulo("Aprende java");
        libroDTO1.setDescripcion("datos de un dictador");
        libroDTO1.setUnidadesDisponibles(20);
        arrayLibros[0] = libroDTO;
        arrayLibros[1] = libroDTO1;
        return arrayLibros;
    }
}
