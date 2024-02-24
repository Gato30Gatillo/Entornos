package iesjandula.proyectounidad4.ejercicio45;

import iesjandula.proyectounidad4.arraysdeobjetos.agregacion.Cliente;

public class Biblioteca {
	private static final Libro libroNull= new Libro ("nada","nada",0,"nada","zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
	private static int LIBROS_MAX = 200;
	private String nombre;
	private Libro[] libros;
	private int contLibros=0;
	
	Biblioteca(){
		
	}
	
	Biblioteca(String nombre){
		this.nombre=nombre;
		libros = new Libro[LIBROS_MAX];
		rellenaLibrosNull();
	}
	
	   public Biblioteca(String nombre, Libro[] LibroArray) {

	       this(nombre);
	       
	       for (int i=0; i <LibroArray.length && i<LIBROS_MAX ; i++) {

	               this.añadirLibro(LibroArray[i]);
	           
	       }
	       
	       
	               
	   }

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Libro[] getLibros() {
		Libro[] arrayLibros= new Libro[contLibros];
		int cont=0;
		for(Libro libro: libros) {
			if(libro.compareTo(libroNull)!=0) {
				arrayLibros[cont]=libro;
				cont++;
			}
		}
		return arrayLibros;
	}
	public boolean hayClientes() {
		return contLibros > 0;
	}
	
	public boolean borrarLibro(Libro lb) {

	       boolean encontrado = false;
	       for (int i = 0; i < LIBROS_MAX && !encontrado; i++) {

	           if (libros[i].equals(lb)) {
	               encontrado = true;
	               libros[i] = libroNull;
	               contLibros--;
	           }
	           
	       }

	       return encontrado;

	   }
	
	public void añadirLibro(Libro libro) {
		boolean hecho=false;
		for(int i=0;i<libros.length && !hecho;i++) {
			if(libros[i].equals(libroNull)) {
				libros[i]=libro;
				contLibros++;
				hecho=true;
			}
		}
	}
	public void ListarLibros() {
		for(int i=0;i<libros.length;i++) {
			if(!libros[i].equals(libroNull)) {
				System.out.println(libros[i].toString());
			}
		}
	}
	
	private void rellenaLibrosNull() {
		
		for(int i=0; i<libros.length;i++) {
			libros[i]=libroNull;
		}
	}
	
}
