/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TrabajoGitHub;

import pedirDatos.PedirDatosTeclado;


public class Libro {
    
    String titulo;
    String autor;
    int numPaginas;
    int numCopias;
    
    void Libro() {
        pedirTitulo();
        pedirAutor();
        pedirNumPaginas();
        pedirNumCopias();
    }
    
    void Libro(int n) {
        pedirTitulo();
        pedirAutor();
        pedirNumPaginas();
        pedirNumCopias();
    }
    
    void pedirTitulo() {
        titulo=PedirDatosTeclado.pedirString("Inserte el titulo del libro: ");
    }
    
    void pedirAutor() {
        autor = PedirDatosTeclado.pedirString("Inserte el nombre del autor: ");
    }
    
    void pedirNumPaginas() {
        numPaginas = PedirDatosTeclado.pedirInt("Inserte el número de páginas del libro: ");
        
    }
    
    void pedirNumCopias() {
        numCopias = PedirDatosTeclado.pedirInt("Inserte el número de copias que tiene el libro: ");
    }
    
    void visDatosLibro() {
        System.out.println("Estos son los datos del libro:");
        System.out.println("TITULO: "+titulo);
        System.out.println("AUTOR: "+autor);
        System.out.println("NUMERO DE PAGINAS: "+numPaginas);
        System.out.println("NUMERO DE COPIAS: "+numCopias);
    }

}
